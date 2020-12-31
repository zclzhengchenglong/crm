package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.WareGoodsMapper;
import com.sc.spring.service.SaleDetailsService;
import com.sc.spring.service.SaleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/salelist")   /*控制器类的请求映射url*/
public class SaleListController {

    @Autowired
    SaleListService saleListService;
    @Autowired
    WareGoodsMapper wareGoodsMapper;
    @Autowired
    SaleDetailsService saleDetailsService;

    @RequestMapping("/select.do")
    @ResponseBody
    public ResultNew select(@RequestParam String aoData, HttpSession session){
        System.out.println("+++++++++++++++++++++++++"+aoData);

        String saleUserid=null;

        JSONArray jsonarray = JSONArray.parseArray(aoData);
        int sEcho = 1; //当前第几页

        String datemin = null; //开始日期
        String datemax = null; //结束日期
        String search = null; // 搜索

        int iDisplayStart = 0; // 起始索引
        int iDisplayLength = 0; // 每页显示的行数

        for (int i = 0; i < jsonarray.size(); i++) {
            JSONObject obj = (JSONObject) jsonarray.get(i);
            if (obj.get("name").equals("saleUserid"))
            {

                BigDecimal g=obj.getBigDecimal("value");
                saleUserid =  g.toString();
            }
            if (obj.get("name").equals("sEcho"))
            {
                sEcho = obj.getIntValue("value");
            }
            if (obj.get("name").equals("iDisplayStart"))
            {
                iDisplayStart = obj.getIntValue("value");
            }
            if (obj.get("name").equals("iDisplayLength"))
            {
                iDisplayLength = obj.getIntValue("value");
            }
            if (obj.get("name").equals("search"))
            {
                search = obj.getString("value");
            }
            if (obj.get("name").equals("datemin"))
            {
                datemin = obj.getString("value");
            }

            if (obj.get("name").equals("datemax"))
            {
                datemax = obj.getString("value");
            }
        }


        session.setAttribute("saleUserid",saleUserid);
        System.out.println("3333333333333333333333"+saleUserid);
        PageInfo<SaleList> pageInfo = saleListService.selectpage(saleUserid,iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleList saleList) {
        System.out.println("----"+saleList);
        if(saleList!=null&&saleList.getSaleId()!=null&&!saleList.getSaleId().equals("")){
            if(saleList.getSaleOutstate()!=null&&saleList.getSaleOutstate().equals("已出库")){

                List<SaleDetails> select = saleDetailsService.select(saleList.getSaleId());
                if(select!=null){
                    for (SaleDetails saleDetails : select) {
                        WareGoods wareGoods = wareGoodsMapper.selectByPrimaryKey(Long.parseLong(saleDetails.getSaleCommid()));
                        wareGoods.setInventory(wareGoods.getInventory()-Long.parseLong(saleDetails.getSaleNum()));
                        wareGoodsMapper.updateByPrimaryKey(wareGoods);
                    }
                }
            }
            this.saleListService.update(saleList);
            return new R(200,"修改成功！");
        }else {
            this.saleListService.add(saleList);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(String saleId) {
        System.out.println("--=======--"+saleId);
        this.saleListService.del(saleId);
        System.out.println("3333333333333333");
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleList get(String saleId) {
        System.out.println("--=======--"+saleId);
        return this.saleListService.get(saleId);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                String saleId=new String(s[i]);
                this.saleListService.del(saleId);
            }
        }

        return new R(200,"删除成功！");
    }
}
