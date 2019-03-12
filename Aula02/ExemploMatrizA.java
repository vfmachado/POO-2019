 import java.util.Scanner;

public class ExemploMatrizA {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//PERGUNTA PARA O USUARIO O TAMANHO DA MATRIZ QUADRADA
		System.out.println("Informe o tamanho da matriz");
		int tam = in.nextInt();
		
		char mat[][] = new char[tam][tam];
		//PRINTA A MATRIZ NO FORMATO
		//MATRIZ DE CHAR
		
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (i >= j) {
					mat[i][j] = 'X';
				} else {
					mat[i][j] = 'O';
				}
			
			}
		}
		
		System.out.println();
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//X O 0 0 xis e ó
		//X X 0 0
		//X X X 0
		//X X X X 
		
	}
	
}