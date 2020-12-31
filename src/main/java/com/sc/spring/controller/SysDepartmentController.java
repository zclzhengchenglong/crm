package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.SysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/sysdepartment")   /*控制器类的请求映射url*/
public class SysDepartmentController {

    @Autowired
    SysDepartmentService sysDepartmentService;

    @RequestMapping("/select.do")
    @ResponseBody
    public ResultNew select(@RequestParam String aoData){
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

        PageInfo<SysDepartment> pageInfo = sysDepartmentService.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);

        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SysDepartment sysDepartment) {
        System.out.println("----"+sysDepartment);
        if(sysDepartment!=null&&sysDepartment.getDepartId()!=null){
            this.sysDepartmentService.update(sysDepartment);
            return new R(200,"修改成功！");
        }else {
            this.sysDepartmentService.add(sysDepartment);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long departId) {
        System.out.println("--=======--"+departId);
        this.sysDepartmentService.del(departId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SysDepartment get(Long departId) {
        System.out.println("--=======--"+departId);
        return this.sysDepartmentService.get(departId);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                long departId=new Long(s[i]);
                this.sysDepartmentService.del(departId);
            }
        }

        return new R(200,"删除成功！");
    }
    @RequestMapping("/selectRoles.do")
    @ResponseBody
    public List<SysDepartment> selectRoles() {
        return this.sysDepartmentService.selectRoles();
    }
}
