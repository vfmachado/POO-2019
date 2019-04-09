import java.awt.Graphics;
import java.awt.Color;

public class Circulo extends FormaGeometrica {

	public Circulo(int x, int y, Color cor) {
		super(x, y, cor);
	}
	
	public Circulo(int x, int y, int tx, int ty, Color cor) {
		super(x, y, cor);
		this.largura = tx;
		this.altura = ty;
	}

	@Override
	public void desenhar(Graphics g) {
		System.out.println("Desenhando um circulo");
		g.setColor(this.cor);
		g.fillOval(this.posx, this.posy, this.largura, this.altura);
	}


}