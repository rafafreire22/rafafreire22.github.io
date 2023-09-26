package com.sesisenai.prjProdutos.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesisenai.prjProdutos.entities.Produto;
import com.sesisenai.prjProdutos.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoService (ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
		
	}
	public List<Produto> getAllprodutos(){
		return produtoRepository.findAll();
		}
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
		
	}
	
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
