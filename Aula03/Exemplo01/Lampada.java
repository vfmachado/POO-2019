import java.util.Random;

public class Lampada {

	private boolean estado = false;
	private boolean funcionando = true;
	
	public boolean verificarEstado() {
		return estado;
	}
	
	public boolean verificarFunc() {
		return funcionando;
	}
	
	public void ligar() {
		if (funcionando == true) {
			estado = true;
		
			Random r = new Random();
			if (r.nextFloat() < 0.5f) {
				funcionando = false;
				estado = false;
			}		
		}
	}
	
	public void desligar() {
		estado = false;
	}
}
