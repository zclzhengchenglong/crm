package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.OfficeMesDetService;
import com.sc.spring.service.OfficeMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * 类名：OfficeMesController
 * 描述：一段话描述类的信息
 * 作者：谢齐
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/officemesdet")   /*控制器类的请求映射url*/
public class OfficeMesDetController {

    @Autowired
    OfficeMesDetService officeMesDetService;

    @Autowired
    OfficeMesService officeMesService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam String aoData){

        System.out.println("+++++++++++++++++++++++++"+aoData);

        JSONArray jsonarray = JSONArray.parseArray(aoData);
        int sEcho = 1; //当前第几页

        String datemin = null; //开始日期
        String datemax = null; //结束日期
        String search = null; // 搜索

        int iDisplayStart = 0; // 起始索引
        int iDisplayLength = 0; // 每页显示的行数

        for (int i = 0; i < jsonarray.size(); i++) {
            JSONObject obj = (JSONObject) jsonarray.get(i);
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



        PageInfo<Officemesdet> pageInfo = officeMesDetService.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(Officemesdet officemesdet) {
        System.out.println("----"+officemesdet);
        if(officemesdet!=null&&officemesdet.getDetailNo()!=null){
            this.officeMesDetService.update(officemesdet);
            return new R(200,"修改成功！");
        }else {
            this.officeMesDetService.add(officemesdet);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long detailNo) {
        System.out.println("--=======--"+detailNo);
        this.officeMesDetService.del(detailNo);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public Officemesdet get(Long detailNo) {
        System.out.println("--=======--"+detailNo);
        Officemesdet officemesdet = this.officeMesDetService.get(detailNo);
        officemesdet.setMessageStatus("已读");
        this.officeMesDetService.update(officemesdet);
        Officemes officemes = this.officeMesService.get(officemesdet.getSmsNumner().longValue());
        officemesdet.setOfficemes(officemes);
        return officemesdet;
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");  //split()：拆分字符串   split分裂，拆分
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                Long detailNo=new Long(s[i]);
                this.officeMesDetService.del(detailNo);
            }
        }

        return new R(200,"删除成功！");
    }

}
