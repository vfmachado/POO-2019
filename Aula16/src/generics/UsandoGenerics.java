package generics;

import java.util.ArrayList;
import java.util.Scanner;

public class UsandoGenerics {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList lista = null;
		
		System.out.println("informe o tipo do array:");
		String tipo = in.next();
		
		if (tipo.equals("text")) {
			lista = new ArrayList<String>();
			lista.add("Texto 1");
			lista.add("Texto 2");
		} else if (tipo.equals("number")) {
			lista = new ArrayList<Integer>();
			lista.add(10);
			lista.add(20);
		}
		System.out.println("Lista tipo: " + lista.get(0).getClass().getName());
		

		
		System.out.println(lista);
		
		
	}

}
