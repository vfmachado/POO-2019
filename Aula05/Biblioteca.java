
import java.util.ArrayList;
import model.Livro;

public class Biblioteca {

	//declarando a lista de livros
	private ArrayList<Livro> livros;
	
	public Biblioteca() {
		//inicializando a lista de livros
		this.livros = new ArrayList<Livro>();
	}
	
	public void addLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public Livro retirarLivro(int codigo) {
		
		for (Livro livro : this.livros) {
			if (livro.getCodigo() == codigo && livro.getDisponivel()) {
				livro.setDisponivel(false);
				return livro;
			}
		}
		
		return null;
	}
	
	public void devolverLivro(int codigo) {
		for (Livro livro : this.livros) {
			if (livro.getCodigo() == codigo && !livro.getDisponivel()) {
				livro.setDisponivel(true);
				return;
			}
		}
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Cod\tTitulo\t\tDisponibilidade\n");
		for (Livro livro : this.livros) {
			sb.append(livro.getCodigo() + "\t" + livro.getTitulo() + "\t\t");
			
			if (livro.getDisponivel()) {
				sb.append("Disp.\n");
			} else {
				sb.append("Indisp.\n");
			}
			//livro.getDisponivel() ? "Disp\n" : "Indisp";
		}
		return sb.toString();
	}
	
}