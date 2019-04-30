package L03ExAgenda;

public class Contato {

	private String nome;
	
	protected String endereco;
	
	private String telefone;

	private boolean favorito;
	
	public Contato() {
		
	}
	
	public Contato(String nome) {
		this.nome = nome;
		
	}
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	@Override
	public String toString() {
		return "\n\nMeu nome é " + this.nome + "\nMoro em: " + this.endereco + "\nTelefone: " + this.telefone;
	}
	
}
