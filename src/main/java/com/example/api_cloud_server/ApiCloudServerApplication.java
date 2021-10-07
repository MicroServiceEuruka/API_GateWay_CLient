package com.example.api_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ApiCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCloudServerApplication.class, args);
    }

}
