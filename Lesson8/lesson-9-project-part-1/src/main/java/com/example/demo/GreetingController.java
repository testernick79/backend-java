package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Greetings, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
             
            long newCounter = 0; //initialize
            newCounter = counter.get() + counter.incrementAndGet();
            String templateWithName = String.format(template, name);
            Greeting greetingObject = new Greeting(newCounter, templateWithName);
            return greetingObject;
    }
}