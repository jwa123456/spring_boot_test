package com.jw.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiang wei on 2016/12/2.
 */
@Controller
@RequestMapping("/main")
public class TestController {
    private Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping("/first")
    public String firstMethod(@RequestParam(value = "name", required = false, defaultValue = "aaa") String name, Model model) {
        logger.info("hello");
        model.addAttribute("name", name);
        return "first";
    }
}
