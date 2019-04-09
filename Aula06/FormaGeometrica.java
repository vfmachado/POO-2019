import java.awt.Graphics;
import java.awt.Color;
//uma classe abstrata não pode ser instanciada
public abstract class FormaGeometrica {
	
	protected int posx;
	
	protected int posy;
	
	protected int largura;
	
	protected int altura;
	
	protected Color cor;
	
	
	public FormaGeometrica(int posx, int posy, Color cor) {
		this.posx = posx;
		this.posy = posy;
		this.largura = 20;
		this.altura = 20;
		this.cor = cor;
	}
	
	public abstract void desenhar(Graphics g);


}