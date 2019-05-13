package ex01;

public class Gabarito {

	//private ArrayList<String> respostas = new ArrayList<String>();
	private char[] respostas;
	
	public Gabarito() {
		
		respostas = new char[6];
		respostas[0] = 'A';
		respostas[1] = 'B';
		respostas[2] = 'C';
		respostas[3] = 'A';
		respostas[4] = 'B';
		respostas[5] = 'C';
		
		//respostas.add("A");
		
	}
	
	
	public char[] getRespostas() {
		return this.respostas;
	}
}
