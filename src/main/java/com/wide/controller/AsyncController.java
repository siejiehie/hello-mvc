package com.wide.controller;

import com.wide.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by Sai on 2017/2/24.
 */
@Controller
public class AsyncController {

     @Autowired
     private PushService pushService;

     @RequestMapping("/deffer")
     @ResponseBody
     public DeferredResult<String> defferredCall() {
         return pushService.getAsyncUpdate();
     }

}
