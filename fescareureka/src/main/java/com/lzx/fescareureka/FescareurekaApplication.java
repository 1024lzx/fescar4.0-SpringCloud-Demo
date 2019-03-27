package com.lzx.fescareureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FescareurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FescareurekaApplication.class, args);
    }

}
