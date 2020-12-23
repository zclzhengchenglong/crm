package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleList;
import com.sc.spring.service.SaleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

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

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleList> pageInfo = saleListService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleList saleList) {
        System.out.println("----"+saleList);
        if(saleList!=null&&saleList.getSaleId()!=null&&!saleList.getSaleId().equals("")){
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
