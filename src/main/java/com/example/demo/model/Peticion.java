package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.demo.entitySecurity.User;

@Entity
public class Peticion {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
	
	@OneToOne
	private User usuario;
	@OneToOne
	private Animal animal;
	
	public Peticion() {
		// TODO Auto-generated constructor stub
	}

	public Peticion(float id, User usuario, Animal animal) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.animal = animal;
	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	

}
