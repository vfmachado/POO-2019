package generics;

public class Produto {

	private String nome;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sou um prod: " + nome;
	}
}
