package conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria("12345", "Vinicius");
		boolean sair = false;
		do {
			System.out.println("Informe a opcao desejada");
			System.out.println("Seu saldo é de " 
			+ conta.getSaldo() + "\n\n1. Depositar\n2. Sacar\n3. Sair");
			
			try {
			int op = in.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Qual o valor?");
				float valor = in.nextFloat();
				conta.depositar(valor);
			break;
			case 2:
				System.out.println("Qual o valor?");
				float valorSaque = in.nextFloat();
				try {
					conta.sacar(valorSaque);
				} catch (SaqueExcecao e) {
					System.out.println("Erro ao sacar: " + e.getMessage()) ;
					//e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Bye...");
				sair = true;
				break;
				
			}
			} catch (InputMismatchException e) {
				System.out.println("Valor informado inválido. Repita a operação!");
				in.nextLine();
			}
			
		} while(!sair);

	}

}
