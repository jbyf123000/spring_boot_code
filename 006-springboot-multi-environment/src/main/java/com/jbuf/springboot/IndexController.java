package com.jbuf.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping("/say")
    public @ResponseBody String say(){
        return "Hello springboot multi-enviroment";
    }
}
