package conta;

public class SaqueExcecao  extends Exception {

	public SaqueExcecao() {
		super("Saque n�o autorizado. Fora do hor�rio de opera��o...");
	}
	
	public SaqueExcecao(float saldo) {
		super("Saque n�o autorizado. Seu saldo � de " + saldo);
	}
	
}
