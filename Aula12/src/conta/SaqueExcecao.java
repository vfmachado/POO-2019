package conta;

public class SaqueExcecao  extends Exception {

	public SaqueExcecao() {
		super("Saque não autorizado. Fora do horário de operação...");
	}
	
	public SaqueExcecao(float saldo) {
		super("Saque não autorizado. Seu saldo é de " + saldo);
	}
	
}
