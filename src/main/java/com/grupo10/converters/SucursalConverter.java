package com.grupo10.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.grupo10.entities.SucursalEntity;
import com.grupo10.models.SucursalModel;

@Component("sucursalConverter")
public class SucursalConverter {

	@Autowired
	@Qualifier("localidadConverter")
	private LocalidadConverter localidadConverter;

	@Autowired
	@Qualifier("provinciaConverter")
	private ProvinciaConverter provinciaConverter;

	public SucursalModel entityToModel(SucursalEntity sucursal) {
		return new SucursalModel(sucursal.getId_sucursal(), sucursal.getDireccion(),
				provinciaConverter.entityToModel(sucursal.getProvincia()),
				localidadConverter.entityToModel(sucursal.getLocalidad()), sucursal.getLatitud(),
				sucursal.getLongitud());
	}
}
