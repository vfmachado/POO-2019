import java.util.Scanner;
import java.util.Arrays;

public class VetorExemploA {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Determine o tamanho do vetor");
		int tamanho = teclado.nextInt();
		int vetor[]; //declaração
		//inicialização
		vetor = new int[tamanho];

		
		printaVetor(vetor);
		
		//passa por todas as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o valor da posicao " + i);
			//associa o valor digitado a posição i 
			vetor[i] = teclado.nextInt();
		}
		
		
		printaVetor(vetor);

				Arrays.sort(vetor);

		printaVetor(vetor);
		
		//calculo da media
		float soma = 0;
		int menorValor = Integer.MAX_VALUE;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}	
		
		soma /= vetor.length;
		
		System.out.println("A media e " + soma + ". O menor valor e " + menorValor);
		
	}
	
	
	public static void printaVetor(int vetor[]) {
		System.out.print("Vetor: [ "); 
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}
}