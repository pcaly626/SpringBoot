package com.fleshlight.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/web")
    public String index(){
        return "index";
    }

    @GetMapping("/web2")
    public String hello(){
        return "hello";
    }
}