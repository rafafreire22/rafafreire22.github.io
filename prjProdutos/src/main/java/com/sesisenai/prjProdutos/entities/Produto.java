package com.sesisenai.prjProdutos.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")

public class Produto {
	//id, nome, preço
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name ="ncliente")
	private String ncliente;
	
	@Column(name ="fone")
	private String fone;
	//construtor vazio
	public Produto() {
		
	}
	//construtor com parametro
	public Produto(Long idcCliente, String ncliente, String fone){
	    super();
		this.idcCliente = idcCliente;
		this.ncliente = ncliente;
		this.fone = fone;
	}
	
//método de acesso
	public Long getIdcCliente() {
		return idcCliente;
	}
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	public String getName() {
		return ncliente;
	}
	public void setName(String ncliente ) {
		this.ncliente = ncliente;
	}
	public double getPrice() {
		return idcCliente;
	}
	public void setPrice(String fone) {
		this.fone = fone;
	}
	
}
