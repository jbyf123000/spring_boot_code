package com.jbyf.springboot.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Hello springboot";
    }

    @RequestMapping(value = "/mapvalue")
    public @ResponseBody Map<String ,Object> mapvalue(){
        Map<String ,Object> map = new HashMap<>();
        map.put("message","Spring Boot Project");
        return map;
    }
}
