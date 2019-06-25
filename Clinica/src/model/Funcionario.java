package model;

public abstract class Funcionario extends Pessoa {

	private float salario;
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		this.salario = 0;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) throws Exception {
		if (salario < 998) {
			this.salario = 998;
			throw new Exception("Salario minimo configurado... ");
		}
			
		this.salario = salario;
	}
	
	
}
