package model;

import java.io.Serializable;

public class Loja implements Serializable {

	public String nome;
	public int qtdProdutos;
	
	@Override
	public String toString() {
		
		return "Nome: " + nome + "\nQtd prods: " + qtdProdutos;
	}
}
