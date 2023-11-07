package model;

import java.time.LocalDate;

public class Client {

	private int id;

	private String nome;
	
	private String contato;

	private String email;

	private String senha;



	private LocalDate dataNasc;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(int id, String nome,String contato, String email, String senha, LocalDate dataNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.nome = contato;
		this.email = email;
		this.senha = senha;
		this.dataNasc = dataNasc;
	}

	
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


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
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


	public LocalDate getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}