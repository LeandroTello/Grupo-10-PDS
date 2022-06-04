package com.grupo10.models;

public class ProductoModel {
	private int idProducto;
	private String nombre;
	private boolean bebida;
	private boolean vegano;
	private int calorias;
	private String descripcion;
	private float precio;

	public ProductoModel(int idProducto, String nombre, boolean bebida, boolean vegano, int calorias,
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

	public ProductoModel() {
	}

	@Override
	public String toString() {
		return "ProductoModel [idProducto=" + idProducto + ", nombre=" + nombre + ", bebida=" + bebida + ", vegano="
				+ vegano + ", calorias=" + calorias + ", descripcion=" + descripcion + ", precio=" + precio + "]";
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
