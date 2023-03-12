package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.GetApiServise;
import com.example.demo.data.Datum;

@Controller		
public class GetApiController {
	private final GetApiServise getApiServise;
	public GetApiController(GetApiServise getApiServise) {
		this.getApiServise = getApiServise;
		
	}
	
	public 
	@GetMapping("/api")
	public String aaa(Model model) {
		ArrayList<Datum> list = new ArrayList<>();
		list=getApiServise.getApi();
		model.addAttribute("api",list);
		return "GetApi.html";
		
	}
}
