package nested.classes;

public class Pessoa {

	private String nome;
	
	private CPF cpf;
	
	private class CPF {
	
		private String cod;
		
		public CPF(String cod) {
			this.cod = cod;
		}
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.cpf = new CPF("123.123.123-12");
	}
	
	public String getCpf() {
		return this.cpf.cod;
	}
	
	public String getNome() {
		return this.nome;
	}
}
