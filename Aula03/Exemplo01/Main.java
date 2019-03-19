
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Isto esta funcionando");
		
		Lampada lamp = new Lampada();
		
		System.out.println("Lampada funciona? " + lamp.verificarFunc());
		
		System.out.println("Lampada ligada? " + lamp.verificarEstado());
		
		System.out.println("\nVou ligar a lampada...");
		
		lamp.ligar();
		
		System.out.println("Lampada ligada? " + lamp.verificarEstado());
		
		
		
	}
}
