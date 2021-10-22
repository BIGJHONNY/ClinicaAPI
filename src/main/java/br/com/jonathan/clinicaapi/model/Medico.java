package br.com.jonathan.clinicaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMeico;
	
	@Column(length = 100,nullable = false)
	private String nomeMedico;
	
	@Column(length = 100,nullable = false, unique = true)
	private String crm;
	
	@Column
	private String telefoneMedio;

	public Medico() {
	}

	public Medico(Long idMeico, String nomeMedico, String crm, String telefoneMedio) {
		this.idMeico = idMeico;
		this.nomeMedico = nomeMedico;
		this.crm = crm;
		this.telefoneMedio = telefoneMedio;
	}

	public Long getIdMeico() {
		return idMeico;
	}

	public void setIdMeico(Long idMeico) {
		this.idMeico = idMeico;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getTelefoneMedio() {
		return telefoneMedio;
	}

	public void setTelefoneMedio(String telefoneMedio) {
		this.telefoneMedio = telefoneMedio;
	}
	
	
	
	

}
