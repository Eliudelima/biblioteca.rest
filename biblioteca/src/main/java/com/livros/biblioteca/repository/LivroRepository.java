package com.livros.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.biblioteca.models.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long>{
	
	Livro findById(long id);

}
