package com.sc.spring.config;

import com.sc.spring.interceptor.LogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 类名：LogConfig
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/12/28 19:14
 * 版本：V1.0
 */
@Configuration
public class LogConfig implements WebMvcConfigurer {

    @Autowired
    LogInterceptor logInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(logInterceptor);
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                "/loginctrl/login.do",            //登录
                "/images/**",            //html静态资源
                "/css/**",              //js静态资源
                "/js/**",             //css静态资源
                "/upload/**",
                "/datas/**",
                "/lib/**",
                "/build/**",
                "/components/**",
                "/plugins/**",
                "/src/**",
                "/views/**",
                "/static/**",
                "/**/*.html",
                "/**.html"
                );
    }
}
