package com.spring.productmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicrosApplication.class, args);
    }

}
