package com.collection.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long id;
	
	@NotNull
	@Size(min=1,max=40,message="insert nombre")
	private String nombre;
	
	@NotNull
	@Size(min=1,max=40,message="insert marca")
	private String marca;
	
	@NotNull
	@Size(min=1,max=40,message="insert Date")
	//@DateTimeFormat(pattern="dd/MM/YYYY")
	//@Temporal(TemporalType.DATE)
	private String fecregistro;
	
	@NotNull
	private Double costo;
	
	@NotNull
	@Size(min=1,max=40,message="insert tamaño")
	private String tamano;
	
	@NotNull
	private int cantidad;
	
	@NotNull
	@Size(min=1,max=40,message="insert descripcion")
	private String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFecregistro() {
		return fecregistro;
	}

	public void setFecregistro(String fecregistro) {
		this.fecregistro = fecregistro;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
