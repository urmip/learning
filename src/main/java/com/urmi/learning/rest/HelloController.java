package com.urmi.learning.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Feature-1!";
    }

    @RequestMapping("/chin")
    public String index1() {
        return "hi from chinmay!";
    }


}
