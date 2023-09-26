package com.sesisenai.prjProdutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesisenai.prjProdutos.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
