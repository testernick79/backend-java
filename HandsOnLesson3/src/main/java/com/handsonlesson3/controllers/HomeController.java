package com.handsonlesson3.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.handsonlesson3.models.FullStoryInput;

@Controller
public class HomeController {

    @GetMapping("/beginning") 
    public String beginning() {
        // the string index will be looked for in src/main/resources/templates
        return "beginning";
    }
    @GetMapping("/middle")
    public String middle() {
    	return "middle";
    }
    @GetMapping("/end")
    public String end() {
    	return "end";
    }
    @GetMapping("/fullstory")
    public String index(Model model) {
        model.addAttribute("story", new FullStoryInput());
        return "fullstory";
    }
    
    @PostMapping("/result")
    public String storyResult(@ModelAttribute FullStoryInput story) {
    	
        return "result";
    }
}