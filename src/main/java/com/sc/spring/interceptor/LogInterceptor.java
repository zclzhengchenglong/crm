package com.sc.spring.interceptor;

import com.sc.spring.entity.SysJurmes;
import com.sc.spring.entity.SysLog;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.mapper.SysLogMapper;
import com.sc.spring.service.SysAccountService;
import com.sc.spring.service.SysJurmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 类名：LogInterceptor
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/12/28 19:07
 * 版本：V1.0
 */
@Component
public class LogInterceptor implements HandlerInterceptor {


    @Autowired
    SysJurmesService sysJurmesService;
    @Autowired
    SysLogMapper sysLogMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String path = request.getServletPath();
        HttpSession session = request.getSession();

        if(path!=null&&path.contains(".do")){
            path=path.substring(0,path.indexOf(".do")+3);
            System.out.println("当前请求路径是："+path+sysJurmesService);
            List<SysJurmes> sysJurmes = sysJurmesService.selectByURL(path);
            if(sysJurmes!=null&&sysJurmes.size()>0){
                String name=sysJurmes.get(0).getPowerName();
                SysLog log1=new SysLog();
                log1.setLasttime(new Date());
                log1.setLimit(name);
                log1.setFromip(getIpAddress(request));
                SysUseraccount sysUseraccount=(SysUseraccount)session.getAttribute("nowuser");
                log1.setUsernum(new BigDecimal(sysUseraccount.getUserId()));
                sysLogMapper.insert(log1);
            }

        }

        return true;
    }

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
