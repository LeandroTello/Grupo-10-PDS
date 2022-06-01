package com.grupo10.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grupo10.helpers.ViewRouteHelper;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("kpo")
	public String index() {
		String modelAndView = "home/index";
	return modelAndView;
	}
		
}
