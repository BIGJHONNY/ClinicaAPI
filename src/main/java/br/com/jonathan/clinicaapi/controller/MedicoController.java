package br.com.jonathan.clinicaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.clinicaapi.model.Medico;
import br.com.jonathan.clinicaapi.repository.MedicoRepository;

@RestController
@RequestMapping("/Medico")
public class MedicoController {
	/*
	 * A anotação Autowired gera um objeto do 
	 * MedicoRepository em tempo de execução, ou seja,
	 * no momento de rodar a aplicação.
	 */
	@Autowired
	private MedicoRepository mr;
	
	@GetMapping("/listar")
	public List<Medico> listar(){
		return mr.findAll();
		
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Medico medico) {
		mr.save(medico);
		return "Medico cadastrado com sucesso!";
		
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Medico medico, @PathVariable Long id) {
		Optional<Medico> me = mr.findById(id);
		
		if(!me.isPresent()) {
			return "O medico nao foi localizado";
		}
		
		medico.setIdMedico(id);
		mr.save(medico);
		return "Medico atualizado com sucesso";
		
		}
		
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id ) {
		mr.deleteById(id);
		return "Medico apagado";
		
		
	}
}
