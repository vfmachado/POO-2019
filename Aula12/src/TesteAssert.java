import java.util.Scanner;

public class TesteAssert {

	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		
		int idade = in.nextInt();
		
		/*
		if (idade < 0 || idade > 120) {
			throw new Exception("Idade invalida");
		}
		*/
		
		//MODO DO DESENVOLVEDOR
		assert (idade > 0 && idade < 120) : "Idade invalida";
		
		System.out.println("OK");
	}
	
}
