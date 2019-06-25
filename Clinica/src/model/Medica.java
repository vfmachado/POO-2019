package model;

public class Medica extends Funcionario {

	
	public Medica(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public String efetuarConsulta(Consulta consulta) {
		
		return consulta.getPaciente().getNome() + "\t" + this.getNome() + "\tRESFRIADO";
	}
}
