package com.grupo10.converters;

import org.springframework.stereotype.Component;

import com.grupo10.entities.LocalidadEntity;
import com.grupo10.models.LocalidadModel;

@Component("localidadConverter")
public class LocalidadConverter {
	public LocalidadModel entityToModel(LocalidadEntity localidad) {
		return new LocalidadModel(localidad.getId_localidad(),localidad.getNombre());
	}

	public LocalidadEntity modelToEntity(LocalidadModel localidad) {
		return new LocalidadEntity(localidad.getId_localidad(),localidad.getNombre());
	}

}
