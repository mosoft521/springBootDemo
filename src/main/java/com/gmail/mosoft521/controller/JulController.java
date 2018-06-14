package com.gmail.mosoft521.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class JulController {

    @RequestMapping("/jul")
    @ResponseBody
    String hello() {

        // 获取Log
        Logger JUL_LOGGER = Logger.getLogger("com.gmail.mosoft521.controller.JulController");
//        Logger JUL_LOGGER = Logger.getGlobal();

        // 为log设置全局等级
        JUL_LOGGER.setLevel(Level.ALL);

        // 控制台输出的handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // 设置控制台输出的等级（如果ConsoleHandler的等级高于或者等于log的level，则按照FileHandler的level输出到控制台，如果低于，则按照Log等级输出）
        consoleHandler.setLevel(Level.FINEST);

        // 添加控制台的handler
        JUL_LOGGER.addHandler(consoleHandler);

        // 设置不使用父类的handlers，这样不会在控制台重复输出信息
        JUL_LOGGER.setUseParentHandlers(false);

        JUL_LOGGER.fine("#fine: Hello world!");
        return "Hello, spring boot!";
    }
}
