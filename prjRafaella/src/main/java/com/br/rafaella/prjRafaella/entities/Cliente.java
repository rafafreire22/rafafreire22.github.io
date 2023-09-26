package com.br.rafaella.prjRafaella.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "ncliente")
	private String ncliente;

	@Column(name = "fone")
	private String fone;

	// construtor vazio
	public Cliente() {

	}

	// construtor com parametro
	public Cliente(Long idcCliente, String ncliente, String fone) {
		super();
		this.idcCliente = idcCliente;
		this.ncliente = ncliente;
		this.fone = fone;
	}
	// método de acesso

	public Long getIdcCliente() {
		return idcCliente;
	}

	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getNcliente() {
		return ncliente;
	}

	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}


	

}
