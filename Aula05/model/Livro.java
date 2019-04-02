
package model;

public class Livro {

	//atributos
	private int codigo;
	private String titulo;
	private String editora;
	private boolean disponivel;
	
	public Livro(String titulo, String editora, int cod) {
		this.titulo = titulo;
		this.editora = editora;
		this.codigo = cod;
		this.disponivel = true;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
		
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public boolean getDisponivel() {
		return this.disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String toString() {
		return String.format("Codigo: %d\nLivro: %s\nEditora: %s", this.codigo, this.titulo, this.editora);
	}
	
}