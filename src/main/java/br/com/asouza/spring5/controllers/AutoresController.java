package br.com.asouza.spring5.controllers;

import java.util.List;

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
	public Mono<List<Autor>> index() {
		Mono<List<Autor>> result = autoresDao.listaTodos();
		System.out.println("ainda não vai ter feito a query");
		return result;
	}
}
