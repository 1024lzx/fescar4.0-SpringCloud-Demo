package com.lzx.aserver;

import com.lzx.fescarinfrustructor.annotation.FescarDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@FescarDemoApplication
public class AserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AserverApplication.class, args);
    }

}
