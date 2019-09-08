package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {
	@RequestMapping("/demo")
	public String demo(Model model, @RequestParam(value ="name", required = false, defaultValue = "Astrophysics") String name) {
		model.addAttribute("name", name);
		return "demo";
	}
}
