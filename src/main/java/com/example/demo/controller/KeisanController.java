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
	
	@GetMapping("/keisan2")
	public String keisanGet() {
		return "keisan.html";
	}
	
	@PostMapping(value="/keisan2" ,params="tasu")
	public String keisanTasu(@RequestParam String p1,@RequestParam String p2,Model model) {
		String kekkaTasu;
		kekkaTasu = keisanService.tasuParam(p1,p2);
		model.addAttribute("kekkaTasu", kekkaTasu);
		return "keisan.html";
	}
	@PostMapping(value="/keisan2" ,params="hiku")
	public String keisanhiku(@RequestParam String p1 ,@RequestParam String p2,Model model) {
		String kekkaHiku;
		kekkaHiku=keisanService.hikuParam(p1,p2);
		model.addAttribute("kekkaHiku",kekkaHiku);
		return "keisan.html";
	}
	@PostMapping(value="/keisan2",params="kake")
	public String keisanKake(@RequestParam String p1,@RequestParam String p2 ,Model model) {
		String kekkaKake;
		kekkaKake = keisanService.kakeParam(p1,p2);
		model.addAttribute("kekkaKake",kekkaKake);
		return "keisan.html";
		
	}
	@PostMapping(value="/keisan2",params="waru")
	public String keisanWaru(@RequestParam String p1,@RequestParam String p2 ,Model model) {
		String kekkaWaru;
		kekkaWaru = keisanService.kakeParam(p1,p2);
		model.addAttribute("kekkaKake",kekkaWaru);
		return "keisan.html";
		
	}
}
