package ex03;

import java.util.ArrayList;

public class Compra {

	private float valorFinal = 0;
	
	public void addItem(Produto p, float quant) {
	
		valorFinal += p.getValor() * quant;
		
	}
	
	
	public String realizarPagamento(MetodoPagamento mp) {
		return mp.processarPagamento(this.valorFinal);
	}
}
