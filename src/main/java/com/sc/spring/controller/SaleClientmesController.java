package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleClientmes;
import com.sc.spring.service.SaleClientmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/saleclientmes")   /*控制器类的请求映射url*/
public class SaleClientmesController {

    @Autowired
    SaleClientmesService saleClientmesService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleClientmes> pageInfo = saleClientmesService.selectpage(iDisplayStart, iDisplayLength, null);
        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(20);
        r.setRecordsFiltered(20);
        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleClientmes saleClientmes) {
        System.out.println("----"+saleClientmes);
        if(saleClientmes!=null&&saleClientmes.getClientnum()!=null){
            this.saleClientmesService.update(saleClientmes);
            return new R(200,"修改成功！");
        }else {
            this.saleClientmesService.add(saleClientmes);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(BigDecimal clientnum) {
        System.out.println("--=======--"+clientnum);
        this.saleClientmesService.del(clientnum);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleClientmes get(BigDecimal clientnum) {
        System.out.println("--=======--"+clientnum);
        return this.saleClientmesService.get(clientnum);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                BigDecimal clientnum=new BigDecimal(s[i]);
                this.saleClientmesService.del(clientnum);
            }
        }

        return new R(200,"删除成功！");
    }
}
