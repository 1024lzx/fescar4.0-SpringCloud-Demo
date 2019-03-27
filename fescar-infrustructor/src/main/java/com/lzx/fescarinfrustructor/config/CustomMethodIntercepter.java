package com.lzx.fescarinfrustructor.config;

import com.alibaba.fescar.core.context.RootContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CustomMethodIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("pre handler:" + request.getRequestURL());
        String restXid = request.getHeader("Fescar-Xid");
        if(StringUtils.isNotBlank(restXid)){
            RootContext.bind(restXid);
        }
        return true;
    }
}
