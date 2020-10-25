package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Animal;
import com.example.demo.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Float>{
	
}
