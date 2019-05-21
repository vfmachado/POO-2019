import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayComExcecao {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int qualquerValor = leiaInteiroDoTerminal();

		
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Vinicius");
		nomes.add("Cristiana");
		nomes.add("Paulo");
		nomes.add("Marlei");
		nomes.add("Manu");
		nomes.add("Guilherme");

		try {
			do {
				System.out.println("Informe uma posição do array");
				int pos = in.nextInt();
				System.out.println("O nome nesta posição é " + nomes.get(pos));
			} while (true);
		} catch (InputMismatchException e) {
			System.out.println("Informe um valor numérico e inteiro");
			in.nextLine();
		} catch (ArrayIndexOutOfBoundsException foraDosLimitesDoArray) {
			System.out.println("Este valor está fora dos limites do array");
		}

	}

	
	public static int leiaInteiroDoTerminal() {
		
		Scanner in = new Scanner(System.in);
		
		do {
		try {
			System.out.println("Informe um valor");
			int valor = in.nextInt();
			return valor;
		} catch (Exception e) {
			System.out.println("Erro ao ler o valor...");
			in.nextLine();
		}
		} while(true);
		
		
		
	}
}
