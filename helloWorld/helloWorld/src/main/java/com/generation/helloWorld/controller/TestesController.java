package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestesController {
	@GetMapping("/objetivos")
	public String ObjetivosAprendizado() {
		return "Objetivos de aprendizagem desta semana:"
				+ "\n- Desenvolvimento backend e frontend"
				+ "\n- API REST"
				+ "\n- Aquitetura MVC"
				+ "\n- JSON";
	}
}
