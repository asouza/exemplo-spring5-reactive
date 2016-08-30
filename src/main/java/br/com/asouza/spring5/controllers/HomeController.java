package br.com.asouza.spring5.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import br.com.asouza.spring5.models.Autor;

@RestController
public class HomeController {

	@RequestMapping("/")
	public Mono<Autor> index() {
		System.out.println("processando...");
		Autor autor = new Autor("Alberto","alberto.souza@caelum.com.br","123456");		
		return Mono.just(autor);
	}
}
