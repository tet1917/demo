package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Paramate {
	@GetMapping("/pretend")
	public String pretend(@RequestParam("aaa") String tetsu, @RequestParam("nakamura") String nakamura, Model model) {
		model.addAttribute("sample", tetsu);
		model.addAttribute("sample2", nakamura);
		return "pretend"; //pretend.htmlを表示する。
	}

	@GetMapping("/post3")
	public String post3() {
		return "post3";
	}

	@PostMapping("/post3Recive")
	public String post3Recive(@RequestParam String post1, @RequestParam String post2, Model model) {
		model.addAttribute("post1", post1);
		model.addAttribute("post2", post2);
		return "post3Recive";

	}
}
