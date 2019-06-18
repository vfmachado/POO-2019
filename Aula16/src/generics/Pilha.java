package generics;

import java.util.ArrayList;
import java.util.List;

public class Pilha<Tipo> {

	List<Tipo> lista;
	
	
	public Pilha() {
		lista = new ArrayList<Tipo>();
	}
	
	
	public void colocar(Tipo valor) {
		lista.add(valor);
	}
	
	
	public Tipo retirar() {
		Tipo valor = lista.get(lista.size()-1);
		lista.remove(lista.size()-1);
		return valor;
	}

	
	public void print() {
		
		for (int i = lista.size() -1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
	}
	
}
