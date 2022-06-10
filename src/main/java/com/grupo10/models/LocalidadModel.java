package com.grupo10.models;


public class LocalidadModel {
	private int id_localidad;
	private String nombre;
	
	public LocalidadModel(int id_localidad, String nombre) {
		super();
		this.id_localidad = id_localidad;
		this.nombre = nombre;
	}
	
	public LocalidadModel() {
	}

	public int getId_localidad() {
		return id_localidad;
	}

	public void setId_localidad(int id_localidad) {
		this.id_localidad = id_localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "LocalidadEntity [id_localidad=" + id_localidad + ", nombre=" + nombre + "]";
	}
	
}
