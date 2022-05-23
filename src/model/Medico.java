package model;

import com.sun.istack.internal.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {
	@Id
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	@NotNull
	private Endereco endereco;  
	
	@Id
	@Column(name = "codigo_medico")
	@NotNull
	private int codigo; 
	
	@Column(name = "nome_medico")
	@NotNull
	private String nome; 
	
	@Column(name = "contato_medico")
	@NotNull
	private String contato;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Medico [endereco=" + endereco + ", codigo=" + codigo + ", nome=" + nome + ", contato=" + contato + "]";
	}
 
	
	
}
