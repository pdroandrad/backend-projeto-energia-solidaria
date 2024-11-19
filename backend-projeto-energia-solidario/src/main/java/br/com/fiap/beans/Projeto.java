package br.com.fiap.beans;

public class Projeto {
	// Tipos de dados e atributos
	private int cod_proj;
	private String nome;
	private String descricao;
	private Double valor;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public Projeto() {
		super();
	}

	public Projeto(int cod_proj, String nome, String descricao, Double valor) {
		super();
		this.cod_proj = cod_proj;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}


	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public int getCod_proj() {
		return cod_proj;
	}

	public void setCod_proj(int cod_proj) {
		this.cod_proj = cod_proj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
