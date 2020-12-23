package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleDetails;
import com.sc.spring.service.SaleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/saledetails")   /*控制器类的请求映射url*/
public class SaleDetailsController {

    @Autowired
    SaleDetailsService saleDetailsService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleDetails> pageInfo = saleDetailsService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleDetails SaleDetails) {
        System.out.println("----"+SaleDetails);
        if(SaleDetails!=null&&SaleDetails.getSaleDid()!=null&&!SaleDetails.getSaleDid().equals("")){
            this.saleDetailsService.update(SaleDetails);
            return new R(200,"修改成功！");
        }else {
            this.saleDetailsService.add(SaleDetails);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(String saleDid) {
        System.out.println("--=======--"+saleDid);
        this.saleDetailsService.del(saleDid);
        System.out.println("3333333333333333");
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleDetails get(String saleDid) {
        System.out.println("--=======--"+saleDid);
        return this.saleDetailsService.get(saleDid);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                String saleId=new String(s[i]);
                this.saleDetailsService.del(saleId);
            }
        }

        return new R(200,"删除成功！");
    }
}
