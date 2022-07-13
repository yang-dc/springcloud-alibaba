package com.xckk.cloudalibabasentinelnacos9008;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaSentinelnacos9008Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelnacos9008Application.class, args);
    }

}
