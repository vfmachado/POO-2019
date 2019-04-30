package L03ExAgenda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agenda {

	private List<Contato> listaContatos;
	
	public Agenda() {
		listaContatos = new ArrayList<Contato>();
	}
	
	public void add(Contato c) {
		listaContatos.add(c);
	}
	
	
	//NA CLASSE AGENDA, IMPLEMENTE UM MÉTODO QUE 
	//RETORNE UMA LISTA CONTENDO APENAS OS CONTATOS PROFISSIONAIS
	public List<Contato> filtraProfisssionais() {
		
		List<Contato> filtro = new ArrayList<Contato>();
		
		for (Contato c : listaContatos) {
			
			if (c.getClass().getSimpleName().equals("ContatoProfissional")) {
				filtro.add(c);
			}
			
		}
		
		
		return filtro;
	}
	
	
	public List<Contato> filtraPorNome(char primeiraLetra) {
		
		List<Contato> filtro = new ArrayList<Contato>();
		
		for (Contato c : listaContatos) {
			
			if (c.getNome().charAt(0) == primeiraLetra) {
				filtro.add(c);
			}
			
		}
		
		
		return filtro;
	}
	
	
	
	
	@Override
	public String toString() {
		return listaContatos.toString();
	}
	
}
