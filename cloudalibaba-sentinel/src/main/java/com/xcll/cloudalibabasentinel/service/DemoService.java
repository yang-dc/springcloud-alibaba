package com.xcll.cloudalibabasentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @SentinelResource("common")
    public String common() {
        return "common";
    }
}
