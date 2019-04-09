
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//a classe painel é um jpanel (extends jpanel)
//a classe painel torna disponível os métodos da classe MouseListener (implements)
public class Painel extends JPanel implements MouseListener, KeyListener {

	private int largura;
	
	private int altura;
	
	private ArrayList<FormaGeometrica> formas;

	private Color corAtual;
	
	private String formaSelecionada;
	
	public Painel() {
		
		this.addMouseListener(this);
		//this.addKeyListener(this);
		
		formaSelecionada = "QUAD";
		
		formas = new ArrayList<FormaGeometrica>();
		
		for (int i = 0; i < 10; i++)
			formas.add(new Quadrado(i * 50, 50, Color.YELLOW));
		
		formas.add(new Circulo(300, 200, Color.GREEN));
		
		
	}


	//sobrescrever o método do JPanel chamado paintComponent
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.black);
		g.drawString("A forma selecionada e': " + formaSelecionada, 50, 50);
		
		largura = this.getWidth();
		altura = this.getHeight();
		
		g.setColor(Color.blue);
		
		for (int i = 0; i < largura; i+=20)
			g.drawLine(i, 0, i, altura);
		
		
		g.setColor(Color.red);
		
		for (FormaGeometrica forma : formas) {
			forma.desenhar(g);
		}

	}
	
	private int x, y;
	
	//override é opcional, o java entende que estamos sobrescrevendo o método
	@Override
	public void mousePressed(MouseEvent e) {

		System.out.println("O usuario clicou em: " + e.getX() + ", " + e.getY());
		
		//formas.add(new Quadrado(e.getX(), e.getY()));
		//repaint();
		this.x = e.getX();
		this.y = e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		int posx = e.getX();
		int posy = e.getY();
		
		int tamx = posx - this.x;
		int tamy = posy - this.y;
		
		if (formaSelecionada.equals("QUAD")) {
			formas.add(new Quadrado(x, y, tamx, tamy, corAtual));
		} else if (formaSelecionada.equals("CIRC")) {
			System.out.println("OK... foi um circ");
			formas.add(new Circulo(x, y, tamx, tamy, corAtual));
		}
		
		repaint();
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {

	}	
	
	@Override
	public void mouseEntered(MouseEvent e) {

	}	

	@Override
	public void mouseClicked(MouseEvent e) {

	}
	
	
	@Override //estou sobrescrevendo um método
	public void keyPressed(KeyEvent e) {
		
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_R) {
			corAtual = Color.RED;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_G) {
			corAtual = Color.GREEN;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_1) {
			formaSelecionada = "QUAD";
		} else if (e.getKeyCode() == KeyEvent.VK_2) {
			formaSelecionada = "CIRC";
			
		}
		
		repaint();
	}

	
	@Override //estou sobrescrevendo um método
	public void keyReleased(KeyEvent e) {
		//nao utilizarei
	}
	
	@Override //estou sobrescrevendo um método
	public void keyTyped(KeyEvent e) {
		
	}
}