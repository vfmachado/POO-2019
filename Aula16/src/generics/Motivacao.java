package generics;

import java.util.ArrayList;

public class Motivacao {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		//lista.add("Texto");
		lista.add(5);
		lista.add(8);
		
		System.out.println(lista.get(0).getClass().getSimpleName());
		System.out.println(lista.get(1).getClass().getSimpleName());
		
		
		//Integer valor = (Integer) lista.get(0); não é necessário fazer o cast
		Integer valor = lista.get(0);
		
		System.out.println(valor);
		
		System.out.println("Codigo rodou!!!");
		
	}
	
}
