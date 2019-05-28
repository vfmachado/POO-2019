package banco.controller;

import java.util.ArrayList;
import java.util.List;

import banco.model.conta.ContaBancaria;
import banco.model.relatorio.Imprimivel;

/**
 * Esta classe é responsável por gerenciar as contas do banco
 * 
 * @author fritz
 *
 */
public class BancoController implements Imprimivel {

	private List<ContaBancaria> contas;
	
	public BancoController() {
	
		this.contas = new ArrayList<ContaBancaria>();
		
	}
	
	
	public void inserirConta(ContaBancaria conta) throws ContaJaExisteException {
		
		for (int i = 0; i < this.contas.size(); i++) {
			if (this.contas.get(i).getNumero() == conta.getNumero()) {
				throw new ContaJaExisteException();
			}
		}
		
		this.contas.add(conta);
	}
	
	public void remover(int numeroConta) {
		
	}
	
	public ContaBancaria procurarConta(int numero) throws ContaInexistenteException {
		
		for (int i = 0; i < this.contas.size(); i++) {
			if (this.contas.get(i).getNumero() == numero) {
				return this.contas.get(i);
			}
		}
		
		
		//SE NÃO PASSOU NO RETURN E CHEGOU ATÉ AQUI... 
		//SIGNIFICA QUE NÃO EXISTE A CONTA
		throw new ContaInexistenteException();
		
	}


	@Override
	public String mostraDados() {

		StringBuilder sb = new StringBuilder();
		
		for (ContaBancaria conta : this.contas) {
			sb.append("\nNumero: " + conta.getNumero() 
				+ "\tTitular: " + conta.getTitular());
		}
		
		
		return sb.toString();

	}
	
	
	
	
	
	
	
}
