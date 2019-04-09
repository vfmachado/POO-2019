import java.awt.Graphics;

public class Quadrado extends FormaGeometrica {

	public Quadrado(int x, int y) {
		super(x, y);
	}
	
	public Quadrado(int x, int y, int tx, int ty) {
		super(x, y);
		this.largura = tx;
		this.altura = ty;
	}

	@Override
	public void desenhar(Graphics g) {
		System.out.println("Vou desenhar um quadrado");
		g.fillRect(this.posx, this.posy, this.largura, this.altura);
	}

	
}