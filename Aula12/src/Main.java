
public class Main {

	public static void main(String[] args) {
		
		int valores[] = {10, 20, 30, 40};
		
		try {
			System.out.println(Utilidades.get(valores, 3));
			//Utilidades.disparaExcecao("Excecao que não faz nada...");
			throw new Exception("TEXTO...");
		} catch (Exception e) {
			System.out.println("Exceção conhecida, mas ta blza");
			e.printStackTrace();
		}
		
		//NÃO POSSO FAZER PQ A EXCEÇÃO DEVE SER OBRIGATORIAMENTE TRATADA
		//Utilidades.get(valores, -5);
	
		System.out.println("Deu tudo certo... ou quase tudo");
	}

}
