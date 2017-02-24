package com.wide.controller;

import com.wide.model.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sai on 2017/2/21.
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/参数对象：(" + obj.getId() + ", " + obj.getName() + ")" + "/来自@ModelAttribute: " + msg);
    }

}
