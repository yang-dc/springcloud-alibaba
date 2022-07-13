package com.xckk.cloudalibabanacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getaway")
public class GateWayController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String getData(){
        return "getData >>> " + port;
    }
}
