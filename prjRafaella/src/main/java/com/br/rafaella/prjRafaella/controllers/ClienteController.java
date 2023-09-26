package com.br.rafaella.prjRafaella.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.rafaella.prjRafaella.entities.Cliente;
import com.br.rafaella.prjRafaella.services.ClientesServices;
@RestController
@RequestMapping("/clients")
public class ClienteController {

	private final ClientesServices clienteService;

	public ClienteController (ClientesServices clienteService) {
		this.clienteService = clienteService;
	}

    @PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
	 return clienteService.savecliente(cliente);
	}
    
    @GetMapping("/{idcCliente}")
    public Cliente getCliente(@PathVariable Long idcCliente) {
    	return clienteService.getclienteById(idcCliente);
    }
    
    @GetMapping
    public List <Cliente> getAllCliente(){
    	return clienteService.getAllCliente();
    }
    
    @DeleteMapping
    public void deleteCliente(@PathVariable Long idcCliente) {
    	clienteService.deleteCliente(idcCliente);
    }
    
    
    

}
