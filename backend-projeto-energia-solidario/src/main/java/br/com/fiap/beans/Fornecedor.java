package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class Fornecedor {
	// Tipos de dados e atributos
	private int cod_forn;
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Contato contato;
	
	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Fornecedor() {
		super();
	}

	public Fornecedor(int cod_forn, String nome, String cnpj, Endereco endereco, Contato contato) {
		super();
		this.cod_forn = cod_forn;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
	}

	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public int getCod_forn() {
		return cod_forn;
	}

	public void setCod_forn(int cod_forn) {
		this.cod_forn = cod_forn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
}
