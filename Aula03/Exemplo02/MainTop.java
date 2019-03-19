import java.util.Scanner;
import java.util.ArrayList;


public class MainTop {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		do {
			System.out.println("Escolha a opcao: \n1. Criar Conta\n2. Acessar conta\n3.Encerrar" );

			int op = in.nextInt();
			switch (op) {
				//VERIFICAR SE JA NAO EXISTE UMA CONTA COM ESTE TITULAR
				case 1: 
					System.out.println("Qual o nome do titular?");
					String titular = in.next();
					Conta contaCriada = new Conta(titular);
					contas.add(contaCriada);
				break;
				
				case 2: 
				System.out.println("Qual titular vai acessar a conta?");
				String titularBusca = in.next();
				Conta contaAtual = null;
				//procurar a conta
				for (Conta c : contas) {
					if (c.quemTitular().equals(titularBusca)) {
						contaAtual = c;
						break;
					}
				}
				
				if (contaAtual != null) {
					System.out.println("Conta encontrada");	
				
					do {
						System.out.println("1. Depositar\n2.Sacar\n3.Saldo\n4.Extrato\n5.Sair");
						int opUsuario = in.nextInt();
						
						switch (opUsuario) {
							case 1:
							System.out.print("Valor: ");
							contaAtual.depositar(in.nextFloat());
							break;
					
							case 2:
							System.out.print("Valor: ");
							contaAtual.sacar(in.nextFloat());
							break;
					
							case 4:
							System.out.print(contaAtual.consultarExtrato());
							break;
					
						}
						
						if (opUsuario == 5) break;
					}  while(true);
				} else {
					System.out.println("Cliente não existe");	
				}
				break;
				
				case 3:
					System.out.println("Bye bye");
				break;
				
				default:
				System.out.println("Opcao invalida");
			}
			
			if (op == 3) break;
		} while (true);
	}
}