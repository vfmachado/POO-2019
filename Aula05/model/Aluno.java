
package model;

//o aluno estende todo o comportamento da classe pessoa;
public class Aluno extends Pessoa {

	
	private int matricula;
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
		
}