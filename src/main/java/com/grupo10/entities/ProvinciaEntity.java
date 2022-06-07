package com.grupo10.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class ProvinciaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_provincia;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	public ProvinciaEntity(int id_provincia, String nombre) {
		super();
		this.id_provincia = id_provincia;
		this.nombre = nombre;
	}

	public int getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ProvinciaEntity [id_provincia=" + id_provincia + ", nombre=" + nombre + "]";
	}
	
	
}