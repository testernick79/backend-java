package com.BaconBuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BaconBuddy.models.Person;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {
	
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("person", new Person());
		return "index";
		
	}
	
	@PostMapping("/person")
	public String personSubmit(@ModelAttribute Person person) {
		return "result";
	}

}
