package L03ExAgenda;

public class ContatoProfissional extends Contato {

	private Empresa empresa;
	
	private int intimidade;

	public ContatoProfissional(String nome, String telefone) {
		super(nome, telefone);
		
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
		this.endereco = empresa.getNome();
	}

	public int getIntimidade() {
		return intimidade;
	}

	public void setIntimidade(int intimidade) {
		this.intimidade = intimidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTrabalho: " + this.empresa.getNome() + "\n e amizade: " + this.intimidade;
	}
	
}
