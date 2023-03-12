package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.ConnectService;

@Controller
public class ConnectController {
	private final ConnectService connectService;
	
	public ConnectController(ConnectService connectService) {
		this.connectService=connectService;
	}
	
	@GetMapping("/connect")
	public String connect1() {
		return "Connect.html";
	}
	
	@PostMapping("/connect")
	public String connect2(String p1, String p2,Model model) {
		String kekka="";
		kekka= connectService.Connect(p1,p2);
		model.addAttribute("kekka", kekka);
		return "Connect.html";
	}
}
