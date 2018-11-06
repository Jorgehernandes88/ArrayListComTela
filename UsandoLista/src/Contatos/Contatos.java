package Contatos;

public class Contatos {

	Integer id;
	String nome;
	String email;
	String celular;
	String cpf;
	String rg;

	public Contatos() {

	}

	public Contatos(Integer id, String nome, String email, String celular, String cpf,String rg) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
		this.rg = rg;
		
	}
	
	public String toString() {
		return nome + " - " + email + " - " + celular  + " - " + cpf  + " - " + rg;
		
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
