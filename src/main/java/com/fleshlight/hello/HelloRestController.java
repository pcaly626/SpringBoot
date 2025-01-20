package com.fleshlight.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fleshlight.message.Message;


@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/hello2")
    public List<Message> sayHelloJSON(){
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello World", "Paul"));
        messages.add(new Message("Hello World 2", "Clay"));

        return messages;
    }   

    @PostMapping("/hello2")
    public List<Message> createMessageJSON(@RequestBody Message message){
        List<Message> messages = new ArrayList<>();
        messages.add(message);
        return messages;
    }
}
