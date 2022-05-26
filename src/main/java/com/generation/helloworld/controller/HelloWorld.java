package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//indica que a classe abaixo é uma classe controladora
@RequestMapping("/hello")
//serve para a contrução dos endpoints da api

public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Hello Wolrd!!!"
				+ "Mentalidades: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência."
				+ "Habilidades: Trabalho em Equipe, Atenção aos Detalhes, Proatividade, Comunicação.";
	}
}