package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Form;

@Controller

public class ContMai {

	    @RequestMapping("/mai")
	    public String form(Model model){
	      model.addAttribute("form", new Form());
	      return "mai.html";
	    }

	    @RequestMapping(value="/mai", method = RequestMethod.POST)
		public String result(@ModelAttribute Form form, Model model){
			form.maiTotal();
			model.addAttribute("form", form);
		 return "result.html";
		}
}
