package generics;

public class PilhaNumerosMain {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha =  new Pilha<Integer>();
		
		pilha.colocar(10);
		pilha.colocar(20);
		pilha.colocar(30);
		pilha.colocar(40);
				
		pilha.print();
		
		int valorRemovido = pilha.retirar();
		
		System.out.println("Valor removido foi: " + valorRemovido);
		
		pilha.print();
		
		valorRemovido = pilha.retirar();
		
		System.out.println("Valor removido foi: " + valorRemovido);
		
		pilha.print();
		
		
	}
	
}
