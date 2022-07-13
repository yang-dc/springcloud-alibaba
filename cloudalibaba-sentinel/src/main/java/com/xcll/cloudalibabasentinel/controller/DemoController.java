package com.xcll.cloudalibabasentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xcll.cloudalibabasentinel.blockhandle.ConsumerBlockHandle;
import com.xcll.cloudalibabasentinel.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
public class DemoController {


    @GetMapping("index")
    public String index() {
        return "index";
    }

    @Autowired
    private DemoService demoService;

    @GetMapping("sentinel1")
    public String sentinel() {
        try {
            TimeUnit.MICROSECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return " hello sentinel 1111";
    }



    @GetMapping("index2")
    public String index2() {
        return "index2";
    }

    @GetMapping("common")
    public String common() {
        return demoService.common() + " <<<<<<<<<<<<<<< common 1";
    }
    @GetMapping("common2")
    public String common2() {
        return demoService.common() +" <<<<<<<<<<< common 2";
    }



    @GetMapping("manDiaoYong")
    public String manDiaoYong() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        System.out.println("man >>" + new Date());
        return "manDiaoYong";
    }

    @GetMapping("exceptionInvokeNum/{id}")
    public String exceptionInvokeNum(@PathVariable("id") int id) throws Exception {
        if (id > 1) {
            throw new Exception();
        }
        return "exceptionInvokeNum";
    }


    @GetMapping("/redian")
    @SentinelResource(value = "redian", blockHandler = "reDian")
    public String reDian(@RequestParam(value = "param1", required = false) String param1,
                         @RequestParam(value = "param2", required = false) String param2,
                         @RequestParam(value = "param3", required = false) String param3) {
        return "reDian ---" + param1 + " " + param2;
    }

    public String reDian(  String param1,
                           String param2,
                            String param3,
                          BlockException e) {
       if (e != null ) {
           e.printStackTrace();
       }
        return "sentinel服务异常，请稍后再试！";
    }

    @GetMapping("/testBlockHandle")
    @SentinelResource(value = "testBlockHandle", blockHandlerClass = ConsumerBlockHandle.class, blockHandler = "block_handle1")
    public String test() {
        return "test";
    }


    @GetMapping("/testBlockHandle2")
    @SentinelResource(value = "testBlockHandle2", blockHandlerClass = ConsumerBlockHandle.class, blockHandler = "block_handle2")
    public String test2() {
        return "test";
    }


}
