package com.myTripleA.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PreciosFechas")
public class Precios {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8682898811350791181L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private int valor;
	private int volumen;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPrecio() {
		return valor;
	}
	public void setPrecio(int valor) {
		this.valor = valor;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	
	}