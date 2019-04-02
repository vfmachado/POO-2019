
package model;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endereco;
	protected String email;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public void setCpf(String value) {
		this.cpf = value;
	}
	
	public void setEndereco(String value) {
		this.endereco = value;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String toString() {
		return this.nome + "\t" + this.cpf;
	}
	
}