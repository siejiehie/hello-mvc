package com.wide.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sai on 2017/2/22.
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", method = RequestMethod.POST, produces = "application/x-widely")
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "-yy");
    }

}
