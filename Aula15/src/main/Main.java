package main;

import model.Loja;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Loja loja = GravadorArquivos.carregaArquivo("lojaTeste.abc");
			//Loja loja = new Loja();
			//loja.nome = "Loja Piloto";
			//loja.qtdProdutos = 1000;
			
			System.out.println(loja);
			
			GravadorArquivos.gravaArquivo(loja, "lojaTeste.abc");
		} catch (Exception e) {
			System.out.println("Erro ao salvar os dados");
			e.printStackTrace();
		}
		
		
	}
	
}
