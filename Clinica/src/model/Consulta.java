package model;

public class Consulta {

	private Paciente paciente;
	
	private float valor;

	public Consulta() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Consulta(Paciente paciente, float valor) {
		this.paciente = paciente;
		this.valor = valor;
	}


	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	
}
