package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("order1")
public interface ActivateExt1 {
    String echo(String msg);
}