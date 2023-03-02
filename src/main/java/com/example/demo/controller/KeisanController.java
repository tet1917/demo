package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.KeisanService;

@Controller
public class KeisanController {
	private final KeisanService keisanService;
	public KeisanController(KeisanService keisanService) {
		this.keisanService = keisanService;
	}

	@GetMapping("/keisan1")
	public String keisan1(@RequestParam String p1,@RequestParam String p2 ,Model model) {
		String kekkaTasu;
		String kekkaHiku;
		String kekkaKake;
		String kekkaWaru;
		
		kekkaTasu = keisanService.tasuParam(p1,p2);
		kekkaHiku = keisanService.hikuParam(p1,p2);
		kekkaKake = keisanService.kakeParam(p1,p2);
		kekkaWaru = keisanService.waruParam(p1,p2);
		model.addAttribute("kekkaTasu", kekkaTasu);
		model.addAttribute("kekkaHiku", kekkaHiku);
		model.addAttribute("kekkaKake", kekkaKake);
		model.addAttribute("kekkaWaru", kekkaWaru);
		return "keisan.html";
	}
	
	@GetMapping("keisan2")
	public String keisanGet() {
		return "keisan.html";
	}
	
	@PostMapping("/keisan2")
	public String keisanPost(@RequestParam String p1,@RequestParam String p2,Model model) {
		String kekkaTasu;
		String kekkaHiku;
		String kekkaKake;
		String kekkaWaru;
		
		kekkaTasu = keisanService.tasuParam(p1,p2);
		kekkaHiku = keisanService.hikuParam(p1,p2);
		kekkaKake = keisanService.kakeParam(p1,p2);
		kekkaWaru = keisanService.waruParam(p1,p2);
		model.addAttribute("kekkaTasu", kekkaTasu);
		model.addAttribute("kekkaHiku", kekkaHiku);
		model.addAttribute("kekkaKake", kekkaKake);
		model.addAttribute("kekkaWaru", kekkaWaru);
		return "keisan.html";
	}
}
