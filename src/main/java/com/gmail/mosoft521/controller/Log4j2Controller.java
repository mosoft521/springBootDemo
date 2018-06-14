package com.gmail.mosoft521.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Log4j2Controller {

    //推荐使用SLF4J接口来调用日志
    private static Logger LOGGER = LoggerFactory.getLogger(Log4j2Controller.class);

    @RequestMapping("/log4j2")
    @ResponseBody
    String log4j2() {
        LOGGER.info("#info: Hello world!");
        LOGGER.warn("#warn: Hello world!");
        LOGGER.error("#error: Hello world!");
        return "Hello, spring boot!";
    }
}
