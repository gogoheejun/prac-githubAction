package com.junjun.pracgitaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    @GetMapping("/good")
    public String good(){
        return "good";
    }
}
