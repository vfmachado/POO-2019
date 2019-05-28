package banco.model.conta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class ContaBancaria {

	private String titular;
	
	private int numero;
	
	protected double saldo;
	
	protected List<String> histOp;
	
	
	public ContaBancaria(String titular, int numero) {
		
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0;
		this.histOp = new ArrayList<String>();
		
		this.histOp.add("Conta criada em: " + Calendar.getInstance().getTime());
		
	}
	
	
	public abstract void sacar(double valor) throws SaldoInsException;
	
	public abstract void depositar(double valor);
	
	public abstract void transferir(double valor, ContaBancaria conta) throws SaldoInsException;


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public List<String> getHistOp() {
		return histOp;
	}
	
	
	
	
}
