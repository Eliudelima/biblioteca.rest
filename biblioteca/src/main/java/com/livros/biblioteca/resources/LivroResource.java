package com.livros.biblioteca.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livros.biblioteca.models.Livro;
import com.livros.biblioteca.repository.LivroRepository;

@RestController
@RequestMapping(value="/api")
public class LivroResource {
	
	@Autowired
	LivroRepository livroRepository;
	
	@GetMapping("/livros")
	public List<Livro> listaLivros(){
		return livroRepository.findAll();
	}
	
	@GetMapping("/livros")
	public Livro listaLivroUnico(@PathVariable(value="id") long id){
		return livroRepository.findById(id);
	}
	
	@PostMapping("/livro")
	public Livro salvalivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	
	@DeleteMapping("/livro")
	public void deletarLivro(@RequestBody Livro livro) {
		livroRepository.delete(livro);
	}
	
	@PutMapping("/livro")
	public Livro atualizaLivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}

}
