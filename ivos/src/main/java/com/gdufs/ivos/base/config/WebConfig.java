package com.gdufs.ivos.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//1.添加注解@Configuration
@Configuration
public class WebConfig implements WebMvcConfigurer{//2.implements WebMvcConfigurer
//3.输⼊addCors,看到提⽰后回⻋补全代码
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//4.去掉⽅法体⾥原有的内容,编写⾃⼰的请求策略
        registry.addMapping("/**")// /** 表⽰在后端允许匹配客⼾端发过来的任意请求
                .allowedHeaders("*")//请求带任意头都可以
                .allowedMethods("*")//任意请求⽅式都可以 get/post/put...
                .allowedOriginPatterns("*")//任意域都可以(任意请求地址或端⼝号)
                .allowCredentials(true)//请求可以携带会话相关信息(cookie/session)
                .maxAge(3600);//同⼀请求⼀⼩时内不再检测 直接放⾏
    }
}
