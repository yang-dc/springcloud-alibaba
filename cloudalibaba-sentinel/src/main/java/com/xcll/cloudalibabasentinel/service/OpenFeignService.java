package com.xcll.cloudalibabasentinel.service;

import com.xcll.cloudalibabasentinel.service.impl.OpenFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "cloudalibaba-nacos9001-producer", fallback = OpenFeignServiceImpl.class)
public interface OpenFeignService {

    @GetMapping("testOpenFeign")
    public String testOpenFeign();

    @GetMapping("index")
    public String sss();
}
