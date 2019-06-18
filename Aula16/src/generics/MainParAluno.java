package generics;

public class MainParAluno {

	public static void main(String[] args) {
		
		Par<Integer, Aluno> matAluno = new Par<Integer, Aluno>();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Vinicius";
		aluno.curso = "ADS";

		matAluno.setVariavel1(20190001);
		matAluno.setVariavel2(aluno);
		
		System.out.println(matAluno);
		
		
		Par<Produto, Integer> prodQuant = new Par<Produto, Integer>();
		prodQuant.setVariavel2(5);
		prodQuant.setVariavel1(new Produto("Chaveiro"));
		
		System.out.println("Encomenda para " + aluno + "\t" +  prodQuant);
		
	}

}
