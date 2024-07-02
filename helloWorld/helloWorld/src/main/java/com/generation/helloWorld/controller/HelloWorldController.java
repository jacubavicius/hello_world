package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ANOTAÇÃO QUE CONFIGURA O ARQUIVO SENDO UM CONTROLLADOR NO PADRÃO REST
@RestController
//ANOTAÇÃO RESPONSAVEL POR PASSAR O CAMINHO DO ENDPOINT
@RequestMapping("/hello-world")
public class HelloWorldController {
	// ANOTAÇÃO QUE TRAZ UM RETORNO PARA QUEM EXECUTAR O ACESSO
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}	

}
 