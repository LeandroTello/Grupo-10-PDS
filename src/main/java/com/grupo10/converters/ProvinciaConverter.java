package com.grupo10.converters;

import org.springframework.stereotype.Component;

import com.grupo10.entities.ProvinciaEntity;
import com.grupo10.models.ProvinciaModel;

@Component("provinciaConverter")
public class ProvinciaConverter {
	public ProvinciaModel entityToModel(ProvinciaEntity provincia) {
		return new ProvinciaModel(provincia.getId_provincia(), provincia.getNombre());
	}

	public ProvinciaEntity modelToEntity(ProvinciaModel provincia) {
		return new ProvinciaEntity(provincia.getId_provincia(), provincia.getNombre());
	}
}
