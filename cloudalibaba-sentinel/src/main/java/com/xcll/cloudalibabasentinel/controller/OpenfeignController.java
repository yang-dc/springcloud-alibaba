package com.xcll.cloudalibabasentinel.controller;

import com.xcll.cloudalibabasentinel.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenfeignController {

    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping("/testOpenFeign")
    public String testOpenFeign() {
        return openFeignService.testOpenFeign();
    }

    @GetMapping("/index3")
    public String sss() {
        return openFeignService.sss();
    }

}
