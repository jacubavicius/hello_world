package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsms")
public class ListaBSMsController {
	@GetMapping
	public String listaBSMs() {
		return "Mentalidades:                "
				+ "\n- Orientação ao futuro"
				+ "\n- Responsabilidade pessoal"
				+ "\n- Orientação ao futuro"
				+ "\n- Responsabilidade pessoal"
				+ "\n\nHabilidades:"
				+ "\n- Trabalho em equipe"
				+ "\n- Orientação ao detalhe"
				+ "\n- Proatividade"
				+ "\n- Comunicação";		
	}
}
