package ex01;

public class Main01 {

	public static void main(String[] args) {
		
		Gabarito gab = new Gabarito();
		
		Prova vinicius = new Prova(gab, "Vinicius");
		
		vinicius.respostaAluno('A');
		vinicius.respostaAluno('B');
		vinicius.respostaAluno('C');
		vinicius.respostaAluno('B');
		vinicius.respostaAluno('C');
		vinicius.respostaAluno('A');
		
		System.out.println(vinicius);
		
		Prova cris = new Prova(gab, "Cris");
		
		cris.respostaAluno('B');
		cris.respostaAluno('C');
		cris.respostaAluno('A');
		cris.respostaAluno('A');
		cris.respostaAluno('B');
		cris.respostaAluno('C');
		
		System.out.println(cris);
		
		System.out.println(vinicius.maior(cris));
	}
	
}
