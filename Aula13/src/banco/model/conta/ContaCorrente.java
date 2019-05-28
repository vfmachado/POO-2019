package banco.model.conta;

import banco.model.relatorio.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

	//ATRIBUTO EST�TICO - pertence a classe... significa que posso acessar sem ter a inst�ncia do objeto.
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
			//lan�a a exce��o
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

	//M�TODO EST�TICO 
	public static double getTxoperacao() {
		return txoperacao;
	}

	//M�TODO EST�TICO
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
