package banco.model.conta;

public class SaldoInsException extends Exception {

	public SaldoInsException() {
		super("Exceção de saldo insuficiente");
	}
	
}
