package com.grupo10.models;

public class CarritoModel {
	private int idProducto;
	private float presio;
	private int cantidad;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public float getPresio() {
		return presio;
	}

	public void setPresio(float presio) {
		this.presio = presio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public CarritoModel(int idProducto, float presio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.presio = presio;
		this.cantidad = cantidad;
	}

	public CarritoModel() {	}

	@Override
	public String toString() {
		return "CarritoModel [idProducto=" + idProducto + ", presio=" + presio + ", cantidad=" + cantidad + "]";
	}

}
