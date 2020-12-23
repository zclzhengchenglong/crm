package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleClientcontrec;
import com.sc.spring.service.SaleClientcontrecService;
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
@RequestMapping("/saleclientcontrec")   /*控制器类的请求映射url*/
public class SaleClientcontrecController {

    @Autowired
    SaleClientcontrecService saleClientcontrecService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleClientcontrec> pageInfo = saleClientcontrecService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(15);
        r.setRecordsFiltered(15);
        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleClientcontrec saleClientcontrec) {
        System.out.println("----"+saleClientcontrec);
        if(saleClientcontrec!=null&&saleClientcontrec.getRecnum()!=null){
            this.saleClientcontrecService.update(saleClientcontrec);
            return new R(200,"修改成功！");
        }else {
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
