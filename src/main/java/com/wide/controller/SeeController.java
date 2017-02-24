package com.wide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by Sai on 2017/2/24.
 */
@Controller
@RequestMapping("/sse")
public class SeeController {

    @RequestMapping(value = "/push", produces = "text/event-stream")
    @ResponseBody
    public String push() {
        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Test 1,2,3," + random.nextInt() + "\n\n";
    }

}
