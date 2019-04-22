package enums;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Funciona!!!");
		Scanner in = new Scanner(System.in);
		
		/*
		System.out.println("Selecione a opção desejada:\n"
				+ Opcao.ABRIR_CONTA.getCod() +". Abrir conta\n"
				+ Opcao.ACESSAR_CONTA.getCod() +". Acessar conta\n"
				+ Opcao.SAIR.getCod() +". Sair");
		*/
		
		for (Opcao op : Opcao.values()) {
			System.out.println(op.descricaoCompleta());
		}
		
		int opcao = in.nextInt();
		Opcao selecionada = Opcao.byValue(opcao);
				
		System.out.println("O usuário selecionou a opcao: " +
				selecionada.name());
		
		switch (selecionada) {
		case ABRIR_CONTA:
			System.out.println("Quero criar uma conta");
			break;
		case ACESSAR_CONTA:
			System.out.println("Quero acessar minha conta");
			break;
		case SAIR:
			System.out.println("Vou embora...");
			break;
		}
		
		
	}

}
