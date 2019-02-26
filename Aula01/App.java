import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.print("Oi... ");
		System.out.println("Sou o Vinicius");
		System.out.printf("Hello %s\n", "JAVA");

		//Scanner teclado = new Scanner(System.in);
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int valor = teclado.nextInt();
				
		teclado.nextLine();
		System.out.println("Digite sua profissao");
		String profissao = teclado.nextLine();
		
		System.out.println("Parabens, voce conseguiu informar os dados");
		
		System.out.printf("Voce digitou %d e trabalha como %s\n", valor, profissao);
		
		System.out.println("Voce informou " + profissao);
		
	}

}
