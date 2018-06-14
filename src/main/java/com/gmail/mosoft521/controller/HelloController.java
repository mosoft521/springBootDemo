package com.gmail.mosoft521.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //推荐使用SLF4J接口来调用日志
    private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        LOGGER.info("#info: Hello world!");
        LOGGER.warn("#warn: Hello world!");
        LOGGER.error("#error: Hello world!");
        return "Hello ,spring boot!";
    }
}
