package com.mikseros.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

	public String index(Model model) {
		model.addAttribute("person", "John Doe");
		return "index";
	}
}
