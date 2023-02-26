package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class fizzbazz {
	@PostMapping("/fizzbazz")
	
	public String fb(@RequestParam("list")String quantity, Model model){
		int num = Integer.parseInt("list");
		
		for ( int i = 1; i <= num+1; i++ ) {
            if ( i % 3 == 0 && i % 5 == 0 ){
            	
            	model.addAttribute("list" ,"FizzBuzz");
            }else if ( i % 3 == 0 ) {
            	
            	model.addAttribute("list" ,"Fizz");
            }else if ( i % 5 == 0 ) {
            	
            	model.addAttribute("list" ,"Buzz");
            	
            }else {
            	model.addAttribute("list" ,i);
            }
        }
		return "fizzbazz.html";
	}

}
