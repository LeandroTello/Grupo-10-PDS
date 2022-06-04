package com.grupo10.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grupo10.models.ProductoModel;

@Service
public interface IProductoService {
	public List<ProductoModel> traerProductos();
}
