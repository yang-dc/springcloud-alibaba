package com.xckk.cloudalibabasentinelnacos9008.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/testSentinel")
    @SentinelResource(value = "testSentinel", blockHandler = "test_sentinel")
    public String testSentinel() {
        return "成功";
    }


    public String test_sentinel(BlockException blockException) {
        return "error";
    }
}
