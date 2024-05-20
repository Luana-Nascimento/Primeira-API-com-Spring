package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	
	//o Get Mapping retorna a visualização do que é pedido
	@GetMapping
	public String ola() {
		return "Olá Mundo! Bom dia!";
	}
	
	@GetMapping("bsm")
	public String bsmGeneration (){
		return "Competências comportamentais: \nComunicação \nProatividade \nOrientação ao Detalhe \nTrabalho em Equipe. \nMentalidades: \nMentalidade de Crescimento \nOrientação ao Futuro \nResponsabilidade Pessoal \nPersistência";
	}
	
	@GetMapping("objetivos")
	public String objetivosSemana (){
		return "Programação Orientada a Objetos (revisão) \nComunicação \nGitHub (Programa de Mentoria GitHub 4 Women - Preparação para certificação)";
	}
}
