package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class HelloContoroller {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "/index";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String register(EchoForm form) {
		return "/register";
	}
}