package com.xckk.cloudalibabanacos9003consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.address.url}")
    private String url;

    @Value("${info.data}")
    private String data;

    @GetMapping("index")
    public String demo() {
        return restTemplate.getForObject(url +"/index", String.class);
    }


    @GetMapping("index2")
    public String demo2() {
        return data;
    }

}
