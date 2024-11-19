package br.com.fiap.beans;

import br.com.fiap.model.Endereco;

public class Administrador {
	// Tipos de dados e atributos
	private int cod_adm;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String senha;
	private Endereco endereco;
	private Contato contato;
	
	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Administrador() {
		super();
	}

	public Administrador(int cod_adm, String nome, String sobrenome, String cpf, String email, String senha,
			Endereco endereco, Contato contato) {
		super();
		this.cod_adm = cod_adm;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.contato = contato;
	}

	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public int getCod_adm() {
		return cod_adm;
	}

	public void setCod_adm(int cod_adm) {
		this.cod_adm = cod_adm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
