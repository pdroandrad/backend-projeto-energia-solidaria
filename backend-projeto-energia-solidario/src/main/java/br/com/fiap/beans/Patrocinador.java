package br.com.fiap.beans;

public class Patrocinador {
	// Tipos de dados e atributos
	private int cod_patrocinador;
	private String nome;
	private String cnpj;
	private Contato contato;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Patrocinador() {
		super();
	}

	public Patrocinador(int cod_patrocinador, String nome, String cnpj, Contato contato) {
		super();
		this.cod_patrocinador = cod_patrocinador;
		this.nome = nome;
		this.cnpj = cnpj;
		this.contato = contato;
	}

	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public int getCod_patrocinador() {
		return cod_patrocinador;
	}

	public void setCod_patrocinador(int cod_patrocinador) {
		this.cod_patrocinador = cod_patrocinador;
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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
