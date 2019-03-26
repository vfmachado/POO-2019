import javafx.util.Pair;

public class Main {

	public static void main(String[] args) {
	
		Produto p1 = new Produto();
		Produto p2 = new Produto("Arroz");
		Produto p3 = new Produto("Feijao", 8);
	
		System.out.println("Produto: " + p1.getNome());System.out.println("Produto: " + p2.getNome());System.out.println("Produto: " + p3.getNome());
		
		System.out.println("\n\n");	
		Produto p4 = new Produto("Biscoito");
		System.out.println("Produto: " + p4.getNome());
		p4.setNome("Bolacha");
		System.out.println("Produto p4 atualizado: " + p4.getNome());
		
		Produto p = p4;
		p4.setNome("Biscoito...");
		
		System.out.println(p.getNome() + "\t" + p4.getNome());
	
		p4 = new Produto("Qualquer");
		System.out.println(p.getNome() + "\t" + p4.getNome());
	
	
		//classe que guarda 2 informações
		Pair<Produto, Integer> quantProduto;
		quantProduto = new Pair(p2, 5);
		
		System.out.println("TESTE DO PAIR: " + 
			quantProduto.getKey().getNome() + " tem " + 
			quantProduto.getValue() + " unidades no estoque");
		
		
		System.out.println("\nCriando meu supermercado");
		Supermercado supermercado = new Supermercado("VFM Cia");
		
		supermercado.addEstoque(p2, 10);
		supermercado.addEstoque(p3, 24);
		supermercado.addEstoque(p4, 3);
		
		p2.setNome("Arroz BlueVille");
		
		System.out.println(supermercado.listaEstoque());
		
		
		System.out.println("Fiz novo pedido...");
		supermercado.addEstoque(p2, 5);
		supermercado.addEstoque(p, 8);
		supermercado.addEstoque(p3, 3);
		
		System.out.println(supermercado.listaEstoque());
		
	}
	
}