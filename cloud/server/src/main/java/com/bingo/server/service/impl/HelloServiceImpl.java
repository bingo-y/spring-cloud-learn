package com.bingo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bingo.server.service.HelloService;

/**
 * @Author: tyx
 * @Date: create in 2018/8/15 16:24
 * @Description:
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
