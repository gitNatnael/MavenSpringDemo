package com.natnael.DemoSpringStudent.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Armin Vojnikovic on 2016-12-09.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring boot world";
    }
}
