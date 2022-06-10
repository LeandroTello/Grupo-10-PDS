package com.grupo10.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grupo10.models.SucursalModel;

@Service
public interface ISucursalService {
	public List<SucursalModel> traerSucursales();
}
