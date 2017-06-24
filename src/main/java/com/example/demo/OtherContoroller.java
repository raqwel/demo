package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;


@Controller
@EnableAutoConfiguration
public class OtherContoroller {
	@RequestMapping("/other")
	public String other(Model model){
		model.addAttribute("value", "Hello Other World");
		return "other";
	}
}