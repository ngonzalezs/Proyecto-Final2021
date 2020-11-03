package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Animal;
@Repository("animalRepositorio")
public interface IAnimalRepo extends JpaRepository<Animal, Long>{
	
}
