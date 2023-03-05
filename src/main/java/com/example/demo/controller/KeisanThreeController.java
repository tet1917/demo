package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.KeisanThreeService;

@Controller
public class KeisanThreeController {
	private final KeisanThreeService keisanThreeService;

	public KeisanThreeController(KeisanThreeService keisanThreeService) {
		this.keisanThreeService = keisanThreeService;
	}
	
	@GetMapping("/kekka3")
	public String keisanGet() {
		return "kekka3.html";
	}
	
	@PostMapping("/kekka3")
	public String keisanPost(@RequestParam String first1 ,@RequestParam String sisoku1 ,@RequestParam String p1 ,@RequestParam String p2 ,@RequestParam String p3,Model model) {
		String kekka;
		kekka = keisanThreeService.keisan(first1,sisoku1,p1,p2,p3);
		model.addAttribute("kekka",kekka);
		return "kekka3.html";
		
	}
}
