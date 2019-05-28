package banco.view;

import java.util.Scanner;

import banco.controller.BancoController;
import banco.controller.ContaInexistenteException;
import banco.controller.ContaJaExisteException;
import banco.model.conta.ContaBancaria;
import banco.model.conta.ContaCorrente;

public class Application {

	//TODO IMPLEMENTAR AS CLASSES CONTASALARIO E CONTAPOUPANÇA
	//TODO MELHORAR A GERAÇÃO DE RELATÓRIOS (ARQUIVOS)
	
	
	public static void main(String[] args) {
		
		BancoController banco = new BancoController();
		Scanner in = new Scanner(System.in);
		boolean sair = false;
		
		ContaCorrente c1 = new ContaCorrente("Vinicius", 1);
		try {
			banco.inserirConta(c1);
		} catch (ContaJaExisteException e) {}
		
		do {
			//TODO IMPLEMENTAR AS OUTRAS OPÇÕES
			System.out.println("Selecione uma opção:\n"
					+ "1. Criar conta\n"
					+ "2. Selecionar conta\n"
					+ "5. Finalizar");
		
			//TODO - TRATAR EXCEÇÃO
			int op = in.nextInt();
			
			switch (op) {
			
			case 1:
				break;
			case 2:
				
				System.out.println("Informe o numero da conta..");
				int numeroConta = in.nextInt();
				
				try {
					
					ContaBancaria contaProcurada = banco.procurarConta(numeroConta);
					menuConta(contaProcurada);
					
				} catch (ContaInexistenteException e) {
					System.out.println("Verifique seu numero! " + e.getMessage());
				}
				
				break;
			case 5:
				sair = true;
				break;
			}
			
			
		} while(!sair);
	}
	
	
	public static void menuConta(ContaBancaria conta) {
		//switch case para minha conta
		//sair... eu dou return e automaticamente volta para o loop do main
	}
}
