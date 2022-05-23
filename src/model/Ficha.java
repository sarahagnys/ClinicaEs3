package model;
import com.sun.istack.internal.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ficha")
public class Ficha {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	@NotNull
	private Paciente paciente; 
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_medico")
	@NotNull
	private Medico medico; 
	
	@Override
	public String toString() {
		return "Ficha [paciente=" + paciente + ", medico=" + medico + ", id=" + id + ", info=" + info + "]";
	}

	@Id
	@Column(name = "id_ficha")
	@NotNull
	private int id;  
	
	@Column(name = "info_ficha")
	@NotNull
	private String info;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	} 

}
