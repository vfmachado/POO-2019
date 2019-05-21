package conta;

import java.util.Random;

public class ContaBancaria {

	private String titular;
	
	private String numeroConta;
	
	private float saldo;
	
	public ContaBancaria(String numero, String titular) {
		this.numeroConta = numero;
		this.titular = titular;
		this.saldo = 0;
	}

	public String getTitular() {
		return titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}
	
	
	//throws - pode disparar...
	public void sacar(float valor) throws SaqueExcecao  {
		
		if (new Random().nextBoolean()) {
			throw new SaqueExcecao();
		}
		
		if (valor > this.saldo)
			throw new SaqueExcecao(this.saldo);
		
		
		this.saldo -= valor;
		
		
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
}
