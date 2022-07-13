package com.xckk.cloudalibabaconfig9004.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

    @Value("${info.data}")
    private String data;

    @GetMapping("config")
    public String config() {
        return "hello nacos config "+ data;
    }
}
