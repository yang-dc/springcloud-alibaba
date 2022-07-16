package com.xckk.cloudalibabaorder8082;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan({"com.xckk.cloudalibabaorder8082.mapper"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudalibabaOrder8082Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaOrder8082Application.class, args);
    }

}
