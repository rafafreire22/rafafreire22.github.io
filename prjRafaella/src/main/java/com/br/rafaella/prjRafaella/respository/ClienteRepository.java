package com.br.rafaella.prjRafaella.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.rafaella.prjRafaella.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
