package ex02;

public class Pessoa {

	private String nome;
	
	private int idade;
	
	private Pessoa pai;
	
	private Pessoa mae;
	
	public Pessoa(String nome) {
		
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	
	
}
