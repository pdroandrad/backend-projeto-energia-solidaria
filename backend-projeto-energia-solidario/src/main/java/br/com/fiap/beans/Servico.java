package br.com.fiap.beans;

public class Servico {
	// Tipos de dados e atributos
	private String servico;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Servico() {
		super();
	}

	public Servico(String servico) {
		super();
		this.servico = servico;
	}

	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
	
}
