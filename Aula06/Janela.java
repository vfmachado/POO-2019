import javax.swing.JFrame;


public class Janela {

	public Janela(String titulo) {
		this(titulo, 600, 400);
	}
		
	public Janela(String titulo, int largura, int altura) {
		//jframe é o tipo ... vem do java swing
								//titulo da janela
		JFrame jframe = new JFrame(titulo);
		
		//largura e altura
		jframe.setSize(largura, altura);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Painel painel = new Painel();
		//jframe.addMouseListener(painel);
		jframe.add(painel);
		
		jframe.addKeyListener(painel);
		
		//janela visivel
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
	
		Janela janela = new Janela("Titulo com construtor");
		//Janela janela2 = new Janela("Titulo 2", 300, 200);
		
		
	}
}