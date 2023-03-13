package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.GetApiServise;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller		
public class GetApiController {
	private final GetApiServise getApiServise;
	public GetApiController(GetApiServise getApiServise) {
		this.getApiServise = getApiServise;
		
	}
	
	@GetMapping("/aaa")
	public String aaa(Model model) throws JsonMappingException, JsonProcessingException {
		ArrayList<String> list = new ArrayList<>();
		list=getApiServise.getApi();
		model.addAttribute("api",list);
		return "GetApi.html";
		
	}
}
