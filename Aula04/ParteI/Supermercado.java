
import javafx.util.Pair;
import java.util.ArrayList;

public class Supermercado {

	private String nome;
	
	//produtoQuantidade
	private ArrayList<Pair<Produto, Integer>> estoqueAtual;
	
	
	public Supermercado(String nome) {
		
		this.nome = nome;
		this.estoqueAtual = new ArrayList<Pair<Produto, Integer>>();
		
	}

	
	public void addEstoque(Produto p, int quant) {
		
		//FOR MELHORADO... PASSA POR TODOS ITENS DO ESTOQUE
		for (Pair<Produto, Integer> prodQuant : estoqueAtual) {
			//System.out.println(prodQuant.getKey().getNome());
			
				//Produto p = prodQuant.getKey();
											//comparar string em java
				if (prodQuant.getKey().getNome().equals(p.getNome())) {	
					//System.out.println("Entrei no teste e add: " + prodQuant.getValue() + " + " + quant);
					
					//removo a referencia atual da lista
					estoqueAtual.remove(prodQuant);
					
					//crio um novo par
					prodQuant = new Pair(p, prodQuant.getValue() + quant);
		
					//adiciono no estoque
					estoqueAtual.add(prodQuant);
				
					//termina o metodo atual
					return;
				}
		}
		
		//CRIA O PRODUTO CASO ELE NAO ESTEJA NO ESTOQUE
		Pair<Produto, Integer> quantProduto;
		
		quantProduto = new Pair(p, quant);
		
		//ADICIONA O PRODUTO A LISTA
		estoqueAtual.add(quantProduto);
		
	}
	
	
	public String listaEstoque() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Pair<Produto, Integer> prodQuant : estoqueAtual) {
			Produto p = prodQuant.getKey();
			int quantidade = prodQuant.getValue();
		
			sb.append("O produto " + p.getNome() + " tem " + quantidade + " unidades em estoque\n");
		}
		return sb.toString();
		
	}
	
}