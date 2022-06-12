package com.grupo10.models;

public class SucursalModel {
	private int id_sucursal;
	private String direccion;
	private ProvinciaModel provincia;
	private LocalidadModel localidad;
	private double latitud;
	private double longitud;
	private String descuento;

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ProvinciaModel getProvincia() {
		return provincia;
	}

	public void setProvincia(ProvinciaModel provincia) {
		this.provincia = provincia;
	}

	public LocalidadModel getLocalidad() {
		return localidad;
	}

	public void setLocalidad(LocalidadModel localidad) {
		this.localidad = localidad;
	}


	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	

	public SucursalModel(int id_sucursal, String direccion, ProvinciaModel provincia, LocalidadModel localidad,
			double latitud, double longitud, String descuento) {
		super();
		this.id_sucursal = id_sucursal;
		this.direccion = direccion;
		this.provincia = provincia;
		this.localidad = localidad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.descuento = descuento;
	}

	public SucursalModel() {
	}

	@Override
	public String toString() {
		return "SucursalModel [id_sucursal=" + id_sucursal + ", direccion=" + direccion + ", provincia=" + provincia
				+ ", localidad=" + localidad + "]";
	}

}
