package br.com.asouza.spring5.daos;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import br.com.asouza.spring5.models.Autor;

@Repository
public class AutorDao {
	
	@Autowired
	private EntityManager manager;

	public Flux<Autor> listaTodos(){		
		Mono<Query> query = Mono.fromSupplier(() -> manager.createQuery("select a from Autor a"));
		Flux<Autor> list = query.flatMap((q) -> Flux.fromIterable(q.getResultList()));
		return list;
		
	}
}
