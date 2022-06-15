package com.grupo10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.grupo10.helpers.ViewRouteHelper;
import com.grupo10.services.SucursalService;
import com.grupo10.services.implementation.IProductoService;
import com.grupo10.models.CarritoModel;

@Controller
@RequestMapping("")
public class HomeController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;
	
	@Autowired
	@Qualifier("sucursalService")
	private SucursalService sucursalService;
	
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOME);
		new CarritoModel();
	return mAV;
	}
	
	@GetMapping("articulos")
	public ModelAndView articulos() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ARTICULOS);
		mAV.addObject("productos",productoService.traerProductos());
		return mAV;
	}
	
	@GetMapping("sucursal")
	public ModelAndView sucursales() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
	@GetMapping("cupon")
	public ModelAndView cupon() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CUPON);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
	@GetMapping("carrito")
	public ModelAndView carrito() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITO);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
	@GetMapping("carritoa")
	public ModelAndView carritoa() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CARRITOa);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
	@GetMapping("carritopago")
	public ModelAndView carritopago() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.carritopago);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
	@GetMapping("codigopedido")
	public ModelAndView codigopedido() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.codigopedido);
		mAV.addObject("sucursales",sucursalService.traerSucursales());
		return mAV;
	}
}
