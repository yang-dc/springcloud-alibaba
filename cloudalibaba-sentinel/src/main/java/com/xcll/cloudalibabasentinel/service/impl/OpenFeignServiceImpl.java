package com.xcll.cloudalibabasentinel.service.impl;

import com.xcll.cloudalibabasentinel.service.OpenFeignService;
import org.springframework.stereotype.Component;

@Component
public class OpenFeignServiceImpl implements OpenFeignService {

    @Override
    public String testOpenFeign() {
        return "系统繁忙，请稍后再试！！！";
    }

    @Override
    public String sss() {
        return "2系统繁忙，请稍后再试！！！";
    }
}
