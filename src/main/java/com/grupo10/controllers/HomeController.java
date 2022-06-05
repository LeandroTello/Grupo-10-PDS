package com.grupo10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.grupo10.helpers.ViewRouteHelper;
import com.grupo10.services.implementation.IProductoService;

@Controller
@RequestMapping("")
public class HomeController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;
	
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOME);
	return mAV;
	}
	
	@GetMapping("articulos")
	public ModelAndView articulos() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ARTICULOS);
		mAV.addObject("productos",productoService.traerProductos());
		String test = "@{/static/assets/img/1.png}";
		mAV.addObject(test);
		return mAV;
	}
}
