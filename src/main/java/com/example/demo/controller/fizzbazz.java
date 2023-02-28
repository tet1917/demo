package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

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
		List<String> list1 = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list1.add("fizzbazz");
			} else if (i % 3 == 0) {
				list1.add("fizz");
			} else if (i % 5 == 0) {
				list1.add("bazz");
			} else {
				list1.add(Integer.toString(i));
			}
			model.addAttribute("list1", list1);
		}
		return "fizzbazz.html";
	}
}
