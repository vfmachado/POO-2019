import java.awt.Graphics;
//uma classe abstrata não pode ser instanciada
public abstract class FormaGeometrica {
	
	protected int posx;
	
	protected int posy;
	
	protected int largura;
	
	protected int altura;
	
	
	public FormaGeometrica(int posx, int posy) {
		this.posx = posx;
		this.posy = posy;
		this.largura = 20;
		this.altura = 20;
	}
	
	public abstract void desenhar(Graphics g);


}