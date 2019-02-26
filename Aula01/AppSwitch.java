import java.util.Scanner;

public class AppSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Informe uma letra");
		
		char letra = scanner.next().toLowerCase().charAt(0);
		
		System.out.println(letra);
		
		switch (letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("A letra " + letra + " e uma vogal");
				break;
			default:
				System.out.println("A letra digitada e uma consoante");
			
		}
		
	}
	
}