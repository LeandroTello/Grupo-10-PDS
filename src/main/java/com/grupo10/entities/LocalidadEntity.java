package com.grupo10.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class LocalidadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_localidad;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	public LocalidadEntity(int id_localidad, String nombre) {
		super();
		this.id_localidad = id_localidad;
		this.nombre = nombre;
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
