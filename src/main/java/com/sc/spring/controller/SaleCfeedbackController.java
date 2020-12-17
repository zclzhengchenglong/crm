package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleCfeedback;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.service.SaleCfeedbackService;
import com.sc.spring.service.SaleClientlossService;
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
@RequestMapping("/salecfeedback")   /*控制器类的请求映射url*/
public class SaleCfeedbackController {

    @Autowired
    SaleCfeedbackService saleCfeedbackService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleCfeedback> pageInfo = saleCfeedbackService.selectpage(iDisplayStart, iDisplayLength, null);
        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(20);
        r.setRecordsFiltered(20);
        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleCfeedback saleCfeedback) {
        System.out.println("----"+saleCfeedback);
        if(saleCfeedback!=null&&saleCfeedback.getBacknum()!=null){
            this.saleCfeedbackService.update(saleCfeedback);
            return new R(200,"修改成功！");
        }else {
            this.saleCfeedbackService.add(saleCfeedback);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(BigDecimal backnum) {
        System.out.println("--=======--"+backnum);
        this.saleCfeedbackService.del(backnum);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleCfeedback get(BigDecimal backnum) {
        System.out.println("--=======--"+backnum);
        return this.saleCfeedbackService.get(backnum);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                BigDecimal backnum=new BigDecimal(s[i]);
                this.saleCfeedbackService.del(backnum);
            }
        }

        return new R(200,"删除成功！");
    }
}
