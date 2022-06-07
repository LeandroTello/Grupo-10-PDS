package com.grupo10.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



	@Entity
	@Table(name = "sucursal")
	public class SucursalEntity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_sucursal;
		
		@Column(name = "direccion", nullable = false)
		private String direccion;

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_provincia", nullable = false)
		private ProvinciaEntity provincia;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_localidad", nullable = false)
		private LocalidadEntity localidad;

		public SucursalEntity(int id_sucursal, String direccion, ProvinciaEntity provincia, LocalidadEntity localidad) {
			super();
			this.id_sucursal = id_sucursal;
			this.direccion = direccion;
			this.provincia = provincia;
			this.localidad = localidad;
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

		public ProvinciaEntity getProvincia() {
			return provincia;
		}

		public void setProvincia(ProvinciaEntity provincia) {
			this.provincia = provincia;
		}

		public LocalidadEntity getLocalidad() {
			return localidad;
		}

		public void setLocalidad(LocalidadEntity localidad) {
			this.localidad = localidad;
		}

		@Override
		public String toString() {
			return "SucursalEntity [id_sucursal=" + id_sucursal + ", direccion=" + direccion + ", provincia="
					+ provincia + ", localidad=" + localidad + "]";
		}

		
}

