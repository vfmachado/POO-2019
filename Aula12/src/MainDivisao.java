import java.util.Scanner;

public class MainDivisao {

	public static void main(String[] args) {
		
		System.out.println("Comecei");
		System.out.println(divisao(5, 0));
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = in.nextInt();
			
		//se a pessoa digitar um texto ^^ 
		if (idade > 0) {
			System.out.println("Nem chega aqui...");
		}
		
		System.out.println("Terminei!!!");
		
		
	}

	
	public static int divisao(int a, int b) {
		
		if (b == 0) {
			System.out.println("Nao posso dividir por zero");
			return 0;
		}
		return a / b;
		
	}
	
}
