import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class ArrayListExemplo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		
		while (true) {
			
			System.out.println("\nInforme um nome:");
			String nome = teclado.nextLine();
			
			if (nome.equals("FIM")) break;
			
			nomes.add(nome);
			System.out.println(nomes.toString());
		}
		/*
		System.out.println("\nInforme um nome para ser removido:");
		String nome = teclado.nextLine();
		nomes.remove(nome);
		
		System.out.println(nomes.toString());
		
		System.out.println("\nInforme uma posicao para ser removida:");
		int pos = Integer.parseInt(teclado.nextLine());
		nomes.remove(pos);
		
		System.out.println(nomes.toString());
		*/
		
		//for melhorado
		for (String n : nomes) {
			//String n = nomes.get(i);
			System.out.println(n);
		}
		System.out.println("\n\n");
		for (int i = 0; i < nomes.size(); i++) {
			String n = nomes.get(i);
			System.out.println(n);
		}
	}
}


