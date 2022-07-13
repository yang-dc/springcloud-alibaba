package com.xckk.cloudalibabanacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("index")
    public String sss() {
        return "hello nacos " + port;
    }

    @GetMapping("testOpenFeign")
    public String testOpenFeign() {
        return "nacos ------> " + port;
    }
}
