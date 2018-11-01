package Contatos;

public class Contatos {

	Integer id;
	String nome;
	String email;
	String celular;

	public Contatos() {

	}

	public Contatos(Integer id, String nome, String email, String celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		return nome + " - " + email + " - " + celular;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
