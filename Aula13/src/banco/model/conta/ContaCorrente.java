package banco.model.conta;

import banco.model.relatorio.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

	//ATRIBUTO ESTÁTICO - pertence a classe... significa que posso acessar sem ter a instância do objeto.
	private static double txoperacao = 0;
	
	public ContaCorrente(String titular, int numero) {
		super(titular, numero);
		
	}

	@Override
	public void sacar(double valor) throws SaldoInsException {
		
		if (valor <= this.saldo) {
			this.saldo -= valor;
			this.histOp.add("Saque no valor de R$ " + valor);
			this.saldo -= txoperacao;
		} else {
			//lança a exceção
			throw new SaldoInsException();
		}
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		this.saldo -= txoperacao;
	}

	@Override
	public void transferir(double valor, ContaBancaria conta) throws SaldoInsException {
		
		this.sacar(valor);
		
		conta.saldo += valor;
		
		
		
	}

	//MÉTODO ESTÁTICO 
	public static double getTxoperacao() {
		return txoperacao;
	}

	//MÉTODO ESTÁTICO
	public static void setTxoperacao(double txoperacao) {
		ContaCorrente.txoperacao = txoperacao;
	}

	@Override
	public String mostraDados() {
		return "Titular: " + this.getTitular() + 
				"\nNumero: " + this.getNumero() + 
				"\nSaldo: R$" + this.getSaldo();
	}

	
	
}
