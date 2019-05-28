package teste;

import banco.controller.BancoController;
import banco.controller.ContaInexistenteException;
import banco.controller.ContaJaExisteException;
import banco.model.conta.ContaBancaria;
import banco.model.conta.ContaCorrente;
import banco.model.conta.SaldoInsException;
import banco.model.relatorio.Relatorio;

public class MainTeste {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("Vinicius", 123);
		
		ContaCorrente c2 = new ContaCorrente("Cristiana", 132);
		
		ContaCorrente c3 = new ContaCorrente("Ale", 123);
		
		
		BancoController banco = new BancoController();
		
		try {
			banco.inserirConta(c1);
			banco.inserirConta(c2);
			banco.inserirConta(c3);
		} catch (ContaJaExisteException e) {
			//e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		
		Relatorio.gerarRelatorio(banco);
		
		
		try {
			
			ContaBancaria contaProcurada = banco.procurarConta(654);
			
			//se chegar aqui... é pq encontrou a conta
			System.out.println("Conta encontrada.. seu saldo é: "
							+ contaProcurada.getSaldo());
			
		} catch (ContaInexistenteException e) {
			System.out.println("Erro!!! " + e.getMessage());
			//e.printStackTrace();
		}
		
		
	}
	
	
	

}
