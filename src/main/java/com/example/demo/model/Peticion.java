package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Peticion {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
	
	@OneToOne
	private Persona duenio;
	@OneToOne
	private Animal animal;
	
	public Peticion() {
		// TODO Auto-generated constructor stub
	}

	public Peticion(float id, Persona duenio, Animal animal) {
		super();
		this.id = id;
		this.duenio = duenio;
		this.animal = animal;
	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
