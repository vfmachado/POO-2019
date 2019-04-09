import java.awt.Graphics;
import java.awt.Color;

public class Quadrado extends FormaGeometrica {

	public Quadrado(int x, int y, Color cor) {
		super(x, y, cor);
	}
	
	public Quadrado(int x, int y, int tx, int ty, Color cor) {
		super(x, y, cor);
		this.largura = tx;
		this.altura = ty;
	}

	@Override
	public void desenhar(Graphics g) {
		System.out.println("Vou desenhar um quadrado");
		g.setColor(this.cor);
		g.fillRect(this.posx, this.posy, this.largura, this.altura);
	}

	
}