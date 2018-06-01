package com.alibaba.dubbo.demo.spi.service;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.demo.spi.ActivateExt1;

@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}