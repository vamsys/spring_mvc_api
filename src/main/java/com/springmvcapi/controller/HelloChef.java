package com.springmvcapi.controller;

import com.springmvcapi.model.SayHelloToChef;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloChef {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello-chef")
    @ResponseBody
    public SayHelloToChef hiChef(
            @RequestParam(name="name", defaultValue = "Chef", required = false) String name
    ) {
            return new SayHelloToChef(counter.incrementAndGet(), String.format(template, name));
    }
}
