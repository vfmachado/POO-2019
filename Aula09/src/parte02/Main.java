package parte02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Idioma idioma;
		
		System.out.println("1. Selecionar língua portuguesa\n"
				+ "2. Select English language");
		
		int op = in.nextInt();
		
		if (op == 1) {
			idioma = new Portugues();
		} else {
			idioma = new Ingles();
		}
		
		System.out.println(idioma.bemvindo());
		System.out.println(idioma.qualSeuNome());
		System.out.println(idioma.tchau());
	}

}
