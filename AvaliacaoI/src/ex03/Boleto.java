package ex03;

public class Boleto extends MetodoPagamento {

	Banco banco;
	
	public Boleto(Banco banco) {
		this.banco = banco;
	}
	
	@Override
	public String processarPagamento(float valor) {
		return "Pagamento no valor de " + valor  + 
				" realizado por meio de boleto bancário do " + this.banco;
	}

}
