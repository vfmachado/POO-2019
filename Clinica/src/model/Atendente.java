package model;

import java.util.List;

public class Atendente extends Funcionario {

	public Atendente(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public boolean marcarConsulta(Consulta consulta, List<Consulta> consultas) {
		
		consultas.add(consulta);
		return true;
	}
}
