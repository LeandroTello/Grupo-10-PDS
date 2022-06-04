package com.grupo10.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Column(name = "Bebida", nullable = false)
	private boolean bebida;
	
	@Column(name = "Vegano", nullable = false)
	private boolean vegano;
	
	@Column(name = "Calorias", nullable = false)
	private int calorias;
	
	@Column(name = "Descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "Precio", nullable = false)
	private float precio;

	@Override
	public String toString() {
		return "ProductoEntity [idProducto=" + idProducto + ", nombre=" + nombre + ", bebida=" + bebida + ", vegano="
				+ vegano + ", calorias=" + calorias + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	public ProductoEntity(int idProducto, String nombre, boolean bebida, boolean vegano, int calorias,
			String descripcion, float precio) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.bebida = bebida;
		this.vegano = vegano;
		this.calorias = calorias;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public ProductoEntity() {
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBebida() {
		return bebida;
	}

	public void setBebida(boolean bebida) {
		this.bebida = bebida;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
