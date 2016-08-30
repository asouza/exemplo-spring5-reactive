package br.com.asouza.spring5.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private BigDecimal preco;
	@ManyToOne
	private Autor autor;
	
	
	/**
	 * @deprecated
	 */
	public Livro() {

	}
	
	public Livro(String titulo, BigDecimal preco, Autor autor) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
}
