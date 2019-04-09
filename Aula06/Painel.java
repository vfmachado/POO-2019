
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//a classe painel é um jpanel (extends jpanel)
//a classe painel torna disponível os métodos da classe MouseListener (implements)
public class Painel extends JPanel implements MouseListener {

	private int largura;
	
	private int altura;
	
	private ArrayList<FormaGeometrica> formas;

	public Painel() {
		
		this.addMouseListener(this);
		
		formas = new ArrayList<FormaGeometrica>();
		
		for (int i = 0; i < 10; i++)
			formas.add(new Quadrado(i * 50, 50));
		
		formas.add(new Circulo(300, 200));
		
		
	}


	//sobrescrever o método do JPanel chamado paintComponent
	public void paintComponent(Graphics g) {
		
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
		
		formas.add(new Quadrado(x, y, tamx, tamy));
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

}