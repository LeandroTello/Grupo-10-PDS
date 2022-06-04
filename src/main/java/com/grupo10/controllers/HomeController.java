package com.grupo10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grupo10.helpers.ViewRouteHelper;
import com.grupo10.services.implementation.IProductoService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;
	
	
	@GetMapping("")
	public String index() {
		String modelAndView = ViewRouteHelper.HOME;
	return modelAndView;
	}
	
	@GetMapping("articulos")
	public ModelAndView articulos() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ARTICULOS);
		mAV.addObject("productos",productoService.traerProductos());
		return mAV;
	}
}
