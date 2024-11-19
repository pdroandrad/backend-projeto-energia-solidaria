package br.com.fiap.beans;

public class User {
	// Tipos de dados e atributos
	private String email;
	private String password;

	// MÉTODO CONSTRUTOR (VAZIO E CHEIO)
	public User() {
		super();
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	// MÉTODO GET (SAÍDA) E SET (ENTRADA)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
