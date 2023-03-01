package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.KakeService;

@Controller
public class KakeController {
	private final KakeService kakeService;
	
	public KakeController(KakeService kakeService) {
		this.kakeService = kakeService;
	}
	
	
	@GetMapping("/kake")
	public String kakeParam1(@RequestParam String p1,@RequestParam String p2,Model model) {
		String kake;
		kake = kakeService.KakeParam(p1, p2);
		model.addAttribute("kake",kake);
		return "kake.html";
	}
	
	@GetMapping("/kake2")
	public String kakeParam2() {
		return "kake.html";
	}
	
	@PostMapping("/kake2")
	public String kakeParam3(@RequestParam String p1,@RequestParam String p2,Model model) {
		String kakeResult;
		kakeResult = kakeService.KakeParam(p1,p2);
		model.addAttribute("kake2", kakeResult);
		return "kake.html";
	}
}