package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionType;

import com.example.demo.entitySecurity.User;

@Entity
public class Animal {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String tipo;
	private int edad;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private User usuario;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(long id, String nombre, String tipo, int edad, User usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.usuario = usuario;
	}

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

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	
	
}
