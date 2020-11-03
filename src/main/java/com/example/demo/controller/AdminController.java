package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Animal;
import com.example.demo.repository.IAnimalRepo;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	@Qualifier("animalRepositorio")
	IAnimalRepo repoAnimal;

	@RequestMapping("")
	public ModelAndView indexUser() {
		ModelAndView modelAndView = new ModelAndView("admin");
		modelAndView.addObject("animales",repoAnimal.findAll());
		return modelAndView;
	}

	@RequestMapping("/form")
	public ModelAndView form(@RequestParam(name = "id",required = false)Long id) {
		ModelAndView modelAndView = new ModelAndView("formulario");
		if(id!=null) {
			Animal animal=repoAnimal.findById(id).orElse(null);
			modelAndView.addObject("animal",animal);
		}
		else {
			modelAndView.addObject("animal", new Animal());
		}

		return modelAndView;
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("animal") Animal animal) {
		repoAnimal.save(animal);
		return "redirect:/admin";
	}
	@RequestMapping("/borrar")
	public String borrar(@RequestParam(name = "id",required = true)Long id) {
		repoAnimal.deleteById(id);
		return "redirect:/admin";
		
	}

}
