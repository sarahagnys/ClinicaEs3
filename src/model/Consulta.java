package model;
import com.sun.istack.internal.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import javafx.scene.chart.PieChart.Data;

@Entity
@Table(name = "consulta")
public class Consulta {
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
	
	@Id
	@Column(name = "id_consulta")
	@NotNull
	private int id; 
	
	@Column(name = "dia_consulta")
	@NotNull
	private Data dia; 
	
	@Column(name = "data_consulta")
	@NotNull
	private Data hora;

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

	public Data getDia() {
		return dia;
	}

	public void setDia(Data dia) {
		this.dia = dia;
	}

	public Data getHora() {
		return hora;
	}

	public void setHora(Data hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente + ", medico=" + medico + ", id=" + id + ", dia=" + dia + ", hora="
				+ hora + "]";
	}
	
}
