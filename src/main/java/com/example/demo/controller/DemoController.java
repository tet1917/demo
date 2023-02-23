package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public String helloWorld(Model model) {

    	return "login.html";
    }
    @GetMapping("/param")
    public String param(Model model) {
    	model.addAttribute("tetsu","こんにちは");
    	return "param.html";
    }
}