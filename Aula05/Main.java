
import model.Livro;
import model.Pessoa;
import model.Aluno;
import model.Secretaria;

public class Main {

	public static void main(String[] args) {
		
		/*
		Livro qlqr;
		qlqr = new Livro(); //construtor padrão da classe
		*/
		
		Livro livro1 = new Livro("Java - Como programar", "Pearson", 1);
		
		//System.out.println(livro);
		
		Livro livro2 = new Livro("Algoritmos", "Pearson", 2);
		
		Livro livro3 = new Livro("Use a Cabeça! Java", "O'Reilly", 3);
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.addLivro(livro1);
		biblioteca.addLivro(livro2);
		biblioteca.addLivro(livro3);
		
		Livro livroRetirado = biblioteca.retirarLivro(1);
		
		System.out.println(biblioteca);
		
		System.out.println("\nUma semana depois\n");
		biblioteca.devolverLivro(livroRetirado.getCodigo());
		
		System.out.println(biblioteca);
		
		Pessoa pessoa = new Pessoa("Vinicius", "123");
		System.out.println(pessoa);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alexandre");
		aluno.setMatricula(1234);
		aluno.setCpf("9999");
		
		System.out.println(aluno);
		
		
		Pessoa p2;
		
		p2 = new Aluno();
		
		p2.setNome("Cristiana");
		p2.setCpf("123123");
		
		Aluno alu = (Aluno)p2;
		
		alu.setMatricula(80118);
		
		System.out.println(alu + "\t" + alu.getMatricula());
		
		Secretaria sec = new Secretaria("Manu", "321312");
		sec.setSalario(1500);
		System.out.println(sec);
		
		
		Secretaria sec2 = new Secretaria("Vitor", "1234564");
		sec2.setSalario(1800);
		
		//sec.setSalario(1000);
		Secretaria.setSalario(1000);
		
		System.out.println(sec);
		System.out.println(sec2);
		
		
	}
}