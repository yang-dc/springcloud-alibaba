package com.xcll.cloudalibabasentinel.blockhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ConsumerBlockHandle {


    public static String block_handle1(BlockException e) {
        return "block_handle1 系统异常，请稍后再试！";
    }


    public static String block_handle2(BlockException e) {
        return "block_handle1 网络开小差了，请稍后再试！";
    }
}
