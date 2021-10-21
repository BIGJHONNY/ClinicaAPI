package br.com.jonathan.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{
	

}
