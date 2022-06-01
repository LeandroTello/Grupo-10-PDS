package com.grupo10.models;

public class ProductoModel {
	private int idproducto;
	private String nombre;
	private boolean bebida;
	private boolean vegano;
	private int calorias;
	private String descripcion;
	private float precio;
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
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
	public ProductoModel(int idproducto, String nombre, boolean bebida, boolean vegano, int calorias,
			String descripcion, float precio) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.bebida = bebida;
		this.vegano = vegano;
		this.calorias = calorias;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	
	
}
