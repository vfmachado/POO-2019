package controller;

import java.util.ArrayList;
import java.util.List;

import model.Consulta;
import model.Medica;

public class Clinica {

	private List<Consulta> listaConsultas;
	private List<String> listaPareceres;
	
	private float saldo;
	
	public Clinica() {
		this.listaConsultas = new ArrayList<Consulta>();
		this.listaPareceres = new ArrayList<String>();
		this.saldo = 0;
	}

	public List<Consulta> getListaConsultas() {
		return listaConsultas;
	}
	
	public void addSaldo(float valor) {
		this.saldo += valor;
	}
	
	public String listarConsultas() {
		
		String result = "";
		
		result += "Registro\tPaciente\tValor";
		
		for (int i = 0; i < listaConsultas.size(); i++) {
			result += "\n" + i  + "\t\t" 
				+ listaConsultas.get(i).getPaciente().getNome() +
				"\t" + listaConsultas.get(i).getValor();
		}
		
		return result;
	}
	
	public void addParecer(String p) {
		this.listaPareceres.add(p);
	}
	
	public String listarPareceres() {
		
		String result = "";
		
		result += "Paciente\tMedico\tParecer";
		
		for (String p : listaPareceres) {
			result += "\n" + p;
		}
		
		return result;
	}
	
	
	public void fazConsulta(Medica m) {
		
		Consulta c = getListaConsultas().get(0);
		
		this.saldo += c.getValor();
		
		this.listaPareceres.add(m.efetuarConsulta(c));
		
		this.listaConsultas.remove(0);
	}
	
}
