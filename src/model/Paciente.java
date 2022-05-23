package model;

import com.sun.istack.internal.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")

public class Paciente {
	@Id
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	@NotNull
	private Endereco endereco;  
	
	@Id
	@Column(name = "id_paciente")
	@NotNull	
	private int id;
	
	@Column(name = "nome_paciente", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "telefone_paciente", length = 10)
	@NotNull
	private String telefone; 
	
	@Column(name = "beneficiario_paciente", length = 100)
	@NotNull
	private String beneficiario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Paciente [endereco=" + endereco + ", id=" + id + ", nome=" + nome + ", telefone=" + telefone
				+ ", beneficiario=" + beneficiario + "]";
	}
	
}
