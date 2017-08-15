package com.wisely.highlight_springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liujinliang on 2017/8/15.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
