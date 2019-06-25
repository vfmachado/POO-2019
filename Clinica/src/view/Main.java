package view;

import controller.Clinica;
import model.Atendente;
import model.Consulta;
import model.Medica;
import model.Paciente;

public class Main {

	public static void main(String[] args) {
		
		Clinica clinica = new Clinica();
		
		Paciente p = new Paciente("Vinicius", "123123");
		p.setFormaPagamento("Dinheiro");
		
		Atendente at1 = new Atendente("John", "123");
		try {
			at1.setSalario(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Consulta c = new Consulta();
		c.setPaciente(p);
		c.setValor(100);
		
		at1.marcarConsulta(c, clinica.getListaConsultas());
		
		Paciente p2 = new Paciente("Cristiana", "123");
		p2.setFormaPagamento("Cartao");
		
		c = new Consulta();
		c.setPaciente(p2);
		c.setValor(200);
		
		at1.marcarConsulta(c, clinica.getListaConsultas());
		
		
		System.out.println(clinica.listarConsultas());
		
		Medica medica = new Medica("Cris", "123");
		try {
			medica.setSalario(10000);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//primeira consulta
		Consulta queVaiRolar = clinica.getListaConsultas().get(0);
		clinica.addSaldo(queVaiRolar.getValor());
		
		
		String parecer = medica.efetuarConsulta(queVaiRolar);
		clinica.addParecer(parecer);
		
		clinica.getListaConsultas().remove(0);
		//remover da lista
		//somar no saldo da clinica o valor da consulta
		//adicionar o parecer na clinica
		
		System.out.println("\n\n" + clinica.listarPareceres());
		
		
		p2 = new Paciente("Aninha", "123");
		p2.setFormaPagamento("Cartao");
		
		c = new Consulta();
		c.setPaciente(p2);
		c.setValor(150);
		
		at1.marcarConsulta(c, clinica.getListaConsultas());
		
		
		
		
		p2 = new Paciente("Ale", "123");
		p2.setFormaPagamento("Cartao");
		
		c = new Consulta();
		c.setPaciente(p2);
		c.setValor(150);
		
		at1.marcarConsulta(c, clinica.getListaConsultas());
		
		
		
		System.out.println("\n\n" + clinica.listarConsultas());
		
		
		//executa uma consulta
		clinica.fazConsulta(medica);
		clinica.fazConsulta(medica);
		
		
		
		System.out.println("\n\n" + clinica.listarPareceres());
		
	}
}
