package excecoes;

import java.time.chrono.MinguoEra;
import java.util.Scanner;

import excecoes.MinhaExcecao.Erro;

public class Caso3 {

	public class Pessoa {
		String nome;
		int cpf;
		
		public void setCpf(int cpf) throws MinhaExcecao {
			if (cpf < 0) {
				throw new MinhaExcecao(Erro.ERRO1);
			}
			this.cpf = cpf;
		}
	}
	
	
	public static void main(String[] args) {

		Pessoa[] array = new Pessoa[3];
			try {
				//array[3] = "OI";
				System.out.println(array[3].nome);
				System.out.println("Cheguei até aqui");
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e1) {
					System.out.println("Cai na e1");
			}
		

		Pessoa p = new Caso3(). new Pessoa();
		
		boolean valido = false;
		Scanner in = new Scanner(System.in);
		while (!valido) {
		try {
			p.setCpf(in.nextInt());
			valido = true;
		} catch (MinhaExcecao e) {
			System.out.println(e.getMessage());
			System.out.println("Informe novamente. Erro: " + e.getErro());
		}
		}
			
		System.out.println("Terminei Programa");
	}

}
