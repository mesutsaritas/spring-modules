package com.saritasmesut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author msaritas
 *
 */
@Controller
public class AppController {

	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title", "Docker + Spring Boot");
		model.addAttribute("msg", "Welcome to the docker container!");
		return "index.html";
	}
}
