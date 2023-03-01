package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.WaruService;

@Controller
public class WaruController {
	private final WaruService waruService;

	public WaruController(WaruService waruService) {
		this.waruService = waruService;
	}

	@GetMapping("/waru")
	public String WaruParam(@RequestParam String p1, @RequestParam String p2, Model model) {
		String waru;
		waru = waruService.waru(p1, p2);
		model.addAttribute("a", waru);
		return "waru.html";
	}

	@GetMapping("/waru1")
	public String WaruParam1() {
		return "waru.html";
	}

	@PostMapping("/waru1")
	public String waruParam2(@RequestParam String p3, @RequestParam String p4, Model model) {
		String waru;
		waru = waruService.waru(p3, p4);
		model.addAttribute("waru", waru);
		return "waru.html";
	}
}