package com.gmail.mosoft521.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {
    private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
        //运行之后在浏览器中访问：http://localhost:8080/hello
    }

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        LOGGER.info("#info: Hello world!");
        LOGGER.warn("#warn: Hello world!");
        LOGGER.error("#error: Hello world!");
        return "Hello ,spring boot!";
    }
}
