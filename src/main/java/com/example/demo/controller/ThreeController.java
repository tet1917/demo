package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.ThreeService;

@Controller
public class ThreeController {
	private final ThreeService threeService;

	public ThreeController(ThreeService threeService) {
		this.threeService = threeService;
	}

	@GetMapping("/three")
	public String ThreeParam1() {
		return "three.html";
	}

	@PostMapping("/three")
	public String THreeParam2(@RequestParam("Par") String Par, Model model) {
		String kekka;
		kekka = threeService.ThreeParam(Par);
		model.addAttribute("kekka", kekka);
		return "three.html";
	}

}
