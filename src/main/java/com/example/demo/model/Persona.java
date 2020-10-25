package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
	private String nombre;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(float id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
