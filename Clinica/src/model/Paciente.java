package model;

public class Paciente extends Pessoa {

	//idealmente - passar para ENUM
	private String formaPagamento;
	
	public Paciente(String nome, String cpf) {
		super(nome, cpf);
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
