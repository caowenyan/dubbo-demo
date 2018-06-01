package com.alibaba.dubbo.demo.spi.service;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.demo.spi.ActivateExt1;

@Activate(order = 2, group = {"order"})
public class OrderActivateExtImpl2 implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}