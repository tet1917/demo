package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class fizzbazz {
	@GetMapping("/fizzbazz")
	public String fb1() {
		return "fizzbazz.html";
	}

	@PostMapping("/fizzbazz")
	public String fb2(@RequestParam("quantity") int quantity, Model model) {
		for (int i = 1; i <= quantity; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				model.addAttribute("list", "fizzbazz");
			} else if (i % 3 == 0) {
				model.addAttribute("list", "fizz");
			} else if (i % 5 == 0) {
				model.addAttribute("list", "bazz");
			} else {
				model.addAttribute("list", i);
			}
		}
		return "fizzbazz.html";
	}
}
