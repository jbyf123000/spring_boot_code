package com.jbyf.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/springboot/say")
    public @ResponseBody String say(){
        return "Hello SpringBoot";
    }
}
