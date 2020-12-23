package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleClientcont;
import com.sc.spring.service.SaleClientcontService;
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
@RequestMapping("/saleclientcont")   /*控制器类的请求映射url*/
public class SaleClientcontController {

    @Autowired
    SaleClientcontService saleClientcontService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleClientcont> pageInfo = saleClientcontService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(15);
        r.setRecordsFiltered(15);
        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleClientcont saleClientcont) {
        System.out.println("----"+saleClientcont);
        if(saleClientcont!=null&&saleClientcont.getContnum()!=null){
            this.saleClientcontService.update(saleClientcont);
            return new R(200,"修改成功！");
        }else {
            this.saleClientcontService.add(saleClientcont);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(BigDecimal contnum) {
        System.out.println("--=======--"+contnum);
        this.saleClientcontService.del(contnum);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleClientcont get(BigDecimal contnum) {
        System.out.println("--=======--"+contnum);
        return this.saleClientcontService.get(contnum);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                BigDecimal contnum=new BigDecimal(s[i]);
                this.saleClientcontService.del(contnum);
            }
        }

        return new R(200,"删除成功！");
    }
}
