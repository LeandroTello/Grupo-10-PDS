package com.grupo10.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.TPOO2.entities.PermisoDiarioEntity;
import com.TPOO2.entities.PermisoEntity;
import com.TPOO2.entities.PermisoPeriodoEntity;
import com.TPOO2.models.PermisoModel;
import com.grupo10.entities.ProductoEntity;
import com.grupo10.models.ProductoModel;
import com.grupo10.services.implementation.IProductoService;


@Service("productoService")
public class ProductoService implements IProductoService{
	
	
	public List<ProductoModel> traerProductos() {
		List<ProductoModel> models = new ArrayList<ProductoModel>();
		for (ProductoEntity permiso : ProductoRepository.findAll()) {

			if (permiso instanceof PermisoPeriodoEntity) {
				models.add(permisoPeriodoConverter.entityToModel((PermisoPeriodoEntity) permiso));
			}

			else if (permiso instanceof PermisoDiarioEntity) {
				models.add(permisoDiarioConverter.entityToModel((PermisoDiarioEntity) permiso));
			}
		}
		return models;
	}

	
	
+
