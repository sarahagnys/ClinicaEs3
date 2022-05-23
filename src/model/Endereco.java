package model;

import com.sun.istack.internal.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Column(name = "logradouro_endereco")
	@NotNull
	private String logradouro; 
	
	@Column(name = "porta_endereco")
	@NotNull
	private String porta;
	
	@Column(name = "cep_endereco")
	@NotNull
	private String cep;
	
	@Column(name = "complemento_endereco")
	@NotNull
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", porta=" + porta + ", cep=" + cep + ", complemento="
				+ complemento + "]";
	} 
	
	
}
