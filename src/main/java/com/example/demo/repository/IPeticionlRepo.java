package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Animal;
import com.example.demo.model.Peticion;

public interface IPeticionlRepo extends JpaRepository<Peticion, Float>{
	
}
