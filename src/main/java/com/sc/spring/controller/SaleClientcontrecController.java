package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.ResultNew;
import com.sc.spring.entity.SaleClientcontrec;
import com.sc.spring.service.SaleClientcontrecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/saleclientcontrec")   /*控制器类的请求映射url*/
public class SaleClientcontrecController {

    @Autowired
    SaleClientcontrecService saleClientcontrecService;

    @RequestMapping("/select.do")
    @ResponseBody
    public ResultNew select(@RequestParam String aoData, HttpSession session){
        System.out.println("+++++++++++++++++++++++++"+aoData);

        JSONArray jsonarray = JSONArray.parseArray(aoData);
        int sEcho = 1; //当前第几页
        BigDecimal clientnum=null;
        String datemin = null; //开始日期
        String datemax = null; //结束日期
        String search = null; // 搜索

        int iDisplayStart = 0; // 起始索引
        int iDisplayLength = 0; // 每页显示的行数

        for (int i = 0; i < jsonarray.size(); i++) {
            JSONObject obj = (JSONObject) jsonarray.get(i);
            if (obj.get("name").equals("clientnum"))
            {
                clientnum = obj.getBigDecimal("value");
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
        session.setAttribute("clientnum",clientnum);
        System.out.println("44444444444444444444444"+clientnum);
        PageInfo<SaleClientcontrec> pageInfo = saleClientcontrecService.selectpage(clientnum,iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);

        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleClientcontrec saleClientcontrec,HttpSession session) {
        System.out.println("----"+saleClientcontrec);
        if(saleClientcontrec!=null&&saleClientcontrec.getRecnum()!=null){
            this.saleClientcontrecService.update(saleClientcontrec);
            return new R(200,"修改成功！");
        }else {
            saleClientcontrec.setClientnum((BigDecimal) session.getAttribute("clientnum"));
            this.saleClientcontrecService.add(saleClientcontrec);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(BigDecimal recnum) {
        System.out.println("--=======--"+recnum);
        this.saleClientcontrecService.del(recnum);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleClientcontrec get(BigDecimal recnum) {
        System.out.println("--=======--"+recnum);
        return this.saleClientcontrecService.get(recnum);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                BigDecimal recnum=new BigDecimal(s[i]);
                this.saleClientcontrecService.del(recnum);
            }
        }

        return new R(200,"删除成功！");
    }
}
