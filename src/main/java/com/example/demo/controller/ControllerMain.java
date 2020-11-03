package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMain {

	@RequestMapping("iniciar")
	public String menu(HttpServletRequest request) {
		if(request.isUserInRole("ROLE_ADMIN")) {
			return "redirect:/admin/test";
		}
		return "redirect:/user/test";

	}
}
