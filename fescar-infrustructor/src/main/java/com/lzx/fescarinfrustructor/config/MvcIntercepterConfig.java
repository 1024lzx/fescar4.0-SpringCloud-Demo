package com.lzx.fescarinfrustructor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcIntercepterConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private CustomMethodIntercepter intercepter;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(intercepter);
    }
}
