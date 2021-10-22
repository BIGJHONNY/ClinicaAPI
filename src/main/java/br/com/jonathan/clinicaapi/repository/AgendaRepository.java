package br.com.jonathan.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
