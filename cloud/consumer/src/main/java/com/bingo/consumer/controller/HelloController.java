package com.bingo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingo.server.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tyx
 * @Date: create in 2018/8/15 16:43
 * @Description:
 */
@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }

}
