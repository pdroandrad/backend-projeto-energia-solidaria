package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class Instituicao {
	// Tipos de dados e atributos
	private int cod_inst;
	private String nome;
	private String tipo;
	private Endereco endereco;
	
	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Instituicao() {
		super();
	}

	public Instituicao(int cod_inst, String nome, String tipo, Endereco endereco) {
		super();
		this.cod_inst = cod_inst;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco = endereco;
	}

	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public int getCod_inst() {
		return cod_inst;
	}

	public void setCod_inst(int cod_inst) {
		this.cod_inst = cod_inst;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
