package com.cheny.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "hello world ! index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}