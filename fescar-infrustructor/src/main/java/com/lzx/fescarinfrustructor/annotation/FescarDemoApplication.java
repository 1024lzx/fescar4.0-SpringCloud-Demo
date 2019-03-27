package com.lzx.fescarinfrustructor.annotation;

import com.lzx.fescarinfrustructor.config.CustomMethodIntercepter;
import com.lzx.fescarinfrustructor.config.CustomMybatisConfig;
import com.lzx.fescarinfrustructor.config.FeignConfiguration;
import com.lzx.fescarinfrustructor.config.MvcIntercepterConfig;
import com.lzx.fescarinfrustructor.exception.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Import({FeignConfiguration.class,MvcIntercepterConfig.class,
        CustomMethodIntercepter.class,GlobalExceptionHandler.class
        ,CustomMybatisConfig.class})
public @interface FescarDemoApplication {
}
