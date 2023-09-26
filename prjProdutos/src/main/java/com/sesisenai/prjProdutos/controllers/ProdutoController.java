package com.sesisenai.prjProdutos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesisenai.prjProdutos.entities.Produto;
import com.sesisenai.prjProdutos.servicies.ProdutoService;
@RestController
@RequestMapping("/products")
public class ProdutoController {
	
	private final ProdutoService produtoService;
	
	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping
	public Produto createProduct(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
		
	}
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
		
	}
	
	@GetMapping
	public List<Produto> getAllProdutos(){
		return produtoService.getAllprodutos();
	}
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		produtoService.deleteProduto(id);
	}
	
	
	

}

