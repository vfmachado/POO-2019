package excecoes;

public class MinhaExcecao extends Exception {

	public enum Erro {
		ERRO0, ERRO1, ERRO2;
	}
	
	private Erro erro;
	
	public MinhaExcecao() {
		this.erro = Erro.ERRO0;
	}
	
	public MinhaExcecao(Erro err) {
		this.erro = err;
	}
	
	public Erro getErro() {
		return erro;
	}
	
}
