package enums;

public enum Opcao {

	ABRIR_CONTA(1, "Abrir conta no banco"),
	ACESSAR_CONTA(2, "Quero acessar minha conta"),
	DEPOSITO(3, "Vou dar um presente para alguém"),
	SAIR(4, "Sair");
	
	private final int codigo;
	private String descricao;
	
	private Opcao(int cod) {
		this.codigo = cod;
	}
	
	private Opcao(int cod, String text) {
		this.codigo = cod;
		this.descricao = text;
	}
	
	public int getCod() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * 
	 * @return Uma descrição completa (cod + texto) para a Opcao desejada.
	 */
	public String descricaoCompleta() {
		return this.codigo + ". " + this.descricao;
	}
	
	public static Opcao byValue(int cod) {
		/*
		if (cod == ABRIR_CONTA.getCod()) {
			return Opcao.ABRIR_CONTA;
		}
		*/
		for (Opcao opAtual : Opcao.values()) {
			if (cod == opAtual.getCod()) {
				return opAtual;
			}
		}
		
		return Opcao.SAIR;
	}
}
