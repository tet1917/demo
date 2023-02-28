package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.SubtractionService;

@Controller
public class SubtractionController {
	private final SubtractionService subtractionService;

	public SubtractionController(SubtractionService subtractionService) {
		this.subtractionService = subtractionService;

	}

	//    @GetMapping("/add")
	//    public String subtractionParam(@RequestParam String p1,@RequestParam String p2, Model model) {
	//
	//    	String subtraction;
	//    	
	//    	subtraction = subtractionService.subtractionParam(p1, p2);
	//    	
	//    	model.addAttribute("subtraction",subtraction);
	//    	
	//    	return "subtraction.html";
	//    }
	@GetMapping("/subtraction")
	public String subtractionParam1() {
		return "subtraction.html";
	}

	@PostMapping("/subtraction")
	public String subtractionParam2(@RequestParam String p1, @RequestParam String p2, Model model) {

		String subtraction;

		subtraction = subtractionService.subtractionParam(p1, p2);
		model.addAttribute("subtraction", subtraction);
		return "subtraction.html";
	}
}
