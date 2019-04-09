import java.awt.Graphics;

public class Circulo extends FormaGeometrica {

	public Circulo(int x, int y) {
		super(x, y);
	}

	@Override
	public void desenhar(Graphics g) {
		System.out.println("Desenhando um circulo");
		g.fillOval(200, 100, 100, 100);
	}


}