package com.wide.controller;

import com.wide.model.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sai on 2017/2/21.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "-json");
    }

    @RequestMapping(value = "/getxml", produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "-xml");
    }

}
