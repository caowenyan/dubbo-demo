package com.alibaba.dubbo.demo.spi.service;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.demo.spi.ActivateExt1;

@Activate(value = {"value1"}, group = {"value"})
public class ValueActivateExtImpl implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}