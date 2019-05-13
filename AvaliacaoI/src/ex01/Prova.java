package ex01;

public class Prova {

	private Gabarito gabarito;
	
	private String nome;
	
	private char[] respostas;
	
	private int numQuestao;
	
	public Prova(Gabarito gabarito, String nome) {
		
		this.gabarito = gabarito;
		this.nome = nome;
		this.respostas = new char[6];
		numQuestao = 0;
	}
	
	public void respostaAluno(char letra) {
		
		respostas[numQuestao] = letra;
		numQuestao++;
		
	}
	
	public int acertos() {
		
		int acertou = 0;
		
		for (int i = 0; i < 6; i++) {
			if (respostas[i] == gabarito.getRespostas()[i]) {
				acertou++;
			}
		}
		
		return acertou;
	}
	
	
	public int nota() {
		
		int nota = 0;
		
		for (int i = 0; i < 6; i++) {
			if (respostas[i] == gabarito.getRespostas()[i]) {
				
				if (i < 2) {
					 nota += 1;
				} else {
					nota += 2;
				}
					
			}
		}
		
		return nota;
	}
	
	
	public int maior(Prova p2) {
		
		if (this.acertos() > p2.acertos()) {
			return this.nota();
		} else if (this.acertos() == p2.acertos()) {
			
			if (this.nota() > p2.nota()) {
				return this.nota();
			} else {
				return p2.nota();
			}
			
		} else {
			return p2.nota();
		}
		
		
	}
	
	@Override
	public String toString() {
		return this.nome + " acertou " + this.acertos() 
		+ " questões e obteve nota " + this.nota();
	}
	
	
}










