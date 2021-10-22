package br.com.jonathan.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
