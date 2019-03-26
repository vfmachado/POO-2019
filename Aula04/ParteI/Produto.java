public class Produto {

	private String nome;
	
	private float valor;
	
		
	//MÉTODO CONSTRUTOR - padrão
	public Produto() {
		this.nome = "Sem nome";
	}

	
	//outro método construtor / polimorfismo
	public Produto(String nome) {
		
		//this 
		//o nome que está associado a instância do meu objeto
		//recebe o valor passado por parâmetro
		this.nome = nome;
	}
	
	
	public Produto(String nome, float valor) {
		this.nome = nome;
		this.valor = valor;
	}		
	
	/*
	//RETORNA O VALOR DA VARIAVEL E NAO A VARIAVEL
	public String pegaNome() {
		return this.nome;
	}
	
	public void trocaNome(String novoNome) {
		this.nome = novoNome;
	}
	*/
	
	//de maneira mais formal, chamamos o método pega de get
	//e o método troca/altera ... de set
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public float getValor() {
		return this.valor;
	}
	
}















