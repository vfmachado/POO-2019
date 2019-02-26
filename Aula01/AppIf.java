import java.util.Scanner;

public class AppIf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		//IMC = massa / altura ^ 2
		System.out.println("Bem Vindo ao IMC Calculator");
		System.out.println("Informe a massa e a altura");
		
		//declaracao
		float massa, altura;
		
		massa = scanner.nextFloat();
		altura = scanner.nextFloat();
		
		boolean ok = massa < 0 ? false : true;
		//boolean ok = massa > 0 ? true : false;
		/*
		int ok;
		if (massa < 0)
			ok = 0;
		else
			ok = 1;
		
		*/
		float imc = massa / (altura * altura);
		System.out.println("IMC calculado: " + imc);
		if (imc < 18.5) {
			System.out.println("\tMuito abaixo do peso");
		} else if (imc < 30) {
			System.out.println("\tPeso aceitavel");
		} else {
			System.out.println("\tAcima do peso");
		}
	}
	
}