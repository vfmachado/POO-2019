package ex03;

public class CartaoCredito extends MetodoPagamento {

	private	Bandeira bandeira;
	
	private String numero;
	
	public CartaoCredito(Bandeira bandeira, String numero) {
		this.bandeira = bandeira;
		this.numero = numero;
	}
	
	@Override
	public String processarPagamento(float valor) {
		/*return "Pagamento no valor de " + valor  + 
				" realizado por meio do cart�o " + this.bandeira + 
				" de numero " + this.numero;
				*/
		return "";
	}

}
