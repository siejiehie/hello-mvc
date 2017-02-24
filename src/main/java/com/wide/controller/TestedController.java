package com.wide.controller;

import com.wide.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Higgs on 2017/2/24.
 */
@Controller
public class TestedController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/normal", method = RequestMethod.GET)
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String testRest() {
        return demoService.saySomething();
    }

}
