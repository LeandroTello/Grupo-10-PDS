package com.grupo10.converters;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.grupo10.entities.ProductoEntity;
import com.grupo10.models.ProductoModel;

@Component("productoConverter")
public class ProductoConverter {

	public ProductoModel entityToModel(ProductoEntity producto) {
		return new ProductoModel(producto.getId_Producto(), producto.getNombre(), producto.isBebida(),
				producto.isVegano(), producto.getCalorias(), producto.getDescripcion(), producto.getPrecio());
	}

	public ProductoEntity modelToEntity(ProductoModel producto) {
		return new ProductoEntity(producto.getIdProducto(), producto.getNombre(), producto.isBebida(),
				producto.isVegano(), producto.getCalorias(), producto.getDescripcion(), producto.getPrecio());
	}

	public Set<ProductoModel> entityToModel(Set<ProductoEntity> lugares) {
		Set<ProductoModel> models = new HashSet<ProductoModel>();

		for (ProductoEntity producto : lugares) {
			models.add(this.entityToModel(producto));

		}
		return models;
	}

	public Set<ProductoEntity> modelToEntity(Set<ProductoModel> lugares) {
		Set<ProductoEntity> models = new HashSet<ProductoEntity>();

		for (ProductoModel producto : lugares) {
			models.add(this.modelToEntity(producto));

		}
		return models;
	}
}
