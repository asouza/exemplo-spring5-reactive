package br.com.asouza.spring5.controllers;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import br.com.asouza.spring5.daos.AutorDao;
import br.com.asouza.spring5.models.Autor;

@RestController
public class AutoresController {
	
	@Autowired
	private AutorDao autoresDao;

	@RequestMapping("/autores")
	public Mono<Iterable<Autor>> index() {
		CompletableFuture<Iterable<Autor>> result = autoresDao.listAll();
		Mono<Iterable<Autor>> mono = Mono.fromFuture(result);
		return mono;
	}
}
