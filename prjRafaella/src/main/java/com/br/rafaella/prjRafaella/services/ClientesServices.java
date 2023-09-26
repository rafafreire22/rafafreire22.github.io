package com.br.rafaella.prjRafaella.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.rafaella.prjRafaella.entities.Cliente;
import com.br.rafaella.prjRafaella.respository.ClienteRepository;

@Service
public class ClientesServices {
	private final ClienteRepository clienteRepository;

	@Autowired
	public ClientesServices (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente savecliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public Cliente getclienteById(long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}

	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}

}
