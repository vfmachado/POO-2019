import java.util.Scanner;

public class AppRepeticao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		int i = 0; 
		while (i < 10) {
			System.out.println("Agora o i vale : " + ++i);	
		}
		
		//executa 1 vez
		do {
			System.out.println("OK");
		} while (false);
		
		
		for (int v = 0; v < 10; v++) {
			System.out.println(v);
		}
		
		int contador = 0;
		//inicialização ; teste lógico ; "passo"
		for ( ; contador < 5 ; ) { //loop infinito
			System.out.println("kkkk");
			contador++;
		}

	}
	
}





