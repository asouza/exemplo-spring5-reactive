package br.com.asouza.spring5.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;
import br.com.asouza.spring5.models.Autor;

@Repository
public class AutorDao {
	
	@Autowired
	private EntityManager manager;

	public Mono<List<Autor>> listaTodos(){		
		Mono<List<Autor>> query = Mono.fromSupplier(() -> manager.createQuery("select a from Autor a").getResultList());
		return query;
		
	}
}
