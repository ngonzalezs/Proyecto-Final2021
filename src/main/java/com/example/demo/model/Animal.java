package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Animal {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
	private String nombre;
	private String tipo;
	private int edad;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Persona duenio;

	public Animal(float id, String nombre, String tipo, int edad, Persona duenio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.duenio = duenio;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
}
