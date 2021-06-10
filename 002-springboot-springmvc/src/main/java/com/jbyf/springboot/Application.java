package com.jbyf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //springboot 项目的代码文件必须在Application文件的同级目录或下级目录
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
