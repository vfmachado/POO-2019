package ex03;

public class AppEcommerce {
	
	public static void main(String[] args) {
		
		Produto sal = new Produto("Sal", 1.90f);
		Produto arroz = new Produto("Arroz", 12.00f);
		Produto banana = new Produto("Banana", 3.25f);
		
		Compra c1 = new Compra();
		c1.addItem(sal, 8.0f);
		c1.addItem(arroz, 4.0f);
		c1.addItem(banana, 3.345f);
		CartaoCredito cc = new CartaoCredito(Bandeira.Master, "34562345682345");
		System.out.println(c1.realizarPagamento(cc));
		
		Compra c2 = new Compra();
		c2.addItem(sal, 2.0f);
		c2.addItem(arroz, 1.0f);
		c2.addItem(banana, 1.345f);
		Boleto bolItau = new Boleto(Banco.ITAU);
		System.out.println(c2.realizarPagamento(bolItau));
		
			
	}
}


