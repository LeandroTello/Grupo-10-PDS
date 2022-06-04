package com.grupo10.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo10.converters.ProductoConverter;
import com.grupo10.entities.ProductoEntity;
import com.grupo10.models.ProductoModel;
import com.grupo10.repositories.IProductoRepository;
import com.grupo10.services.implementation.IProductoService;


@Service("productoService")
public class ProductoService implements IProductoService{
	
	@Autowired
	@Qualifier("productoRepository")
	private IProductoRepository productoRepository;
	
	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;
	
	
	public List<ProductoModel> traerProductos() {
		List<ProductoModel> productos = new ArrayList<ProductoModel>();
		List<ProductoEntity> productosfddfs = productoRepository.findAll();
		for (ProductoEntity producto : productoRepository.findAll()) {
			productos.add(productoConverter.entityToModel(producto));
		}
		return productos;
	}

}