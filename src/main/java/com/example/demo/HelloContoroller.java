package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class HelloContoroller {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("value", "Hello World");
		model.addAttribute("hoge", "wei");

		Map<Integer, String> testMap = new HashMap<>();

		testMap.put(1, "2B");
		testMap.put(2, "9S");
		testMap.put(3, "A2");

		model.addAttribute("testMap", testMap);
		return "index";
	}

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("value", "hohohohoho");
		return "test";
	}

}