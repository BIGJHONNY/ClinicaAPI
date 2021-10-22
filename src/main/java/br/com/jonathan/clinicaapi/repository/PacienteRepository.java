package br.com.jonathan.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
