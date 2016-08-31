package br.com.asouza.spring5.daos;

import java.util.concurrent.CompletableFuture;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import br.com.asouza.spring5.models.Autor;

@Repository
public interface AutorDao extends CrudRepository<Autor, Integer>{

	@Async
	@Query("select a from Autor a")
	public CompletableFuture<Iterable<Autor>> listAll();
}
