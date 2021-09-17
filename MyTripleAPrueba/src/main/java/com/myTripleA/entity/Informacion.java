package com.myTripleA.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DatosGenerales")
public class Informacion {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8682898811350791181L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	//@Column(length=50)
	private String category_id;
	//private String simbolo;
	private String name;
	//private String volumen;
	//private BigInteger valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return name;
	}
	public void setNombre(String name) {
		this.name = name;
	}
	public String getSimbolo() {
		return category_id;
	}
	public void setSimbolo(String category_id) {
		this.category_id = category_id;
	}
//	public String getCategoria() {
//		return categoria;
//	}
//	public void setCategoria(String categoria) {
//		this.categoria = categoria;
//	}
//	public String getVolumen() {
//		return volumen;
//	}
//	public void setVolumen(String volumen) {
//		this.volumen = volumen;
//	}
//	public BigInteger getPrecio() {
//		return valor;
//	}
//	public void setPrecio(BigInteger precio) {
//		this.valor = precio;
//	}
}
