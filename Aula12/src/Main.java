
public class Main {

	public static void main(String[] args) {
		
		int valores[] = {10, 20, 30, 40};
		
		try {
			System.out.println(Utilidades.get(valores, 3));
			//Utilidades.disparaExcecao("Excecao que n�o faz nada...");
			throw new Exception("TEXTO...");
		} catch (Exception e) {
			System.out.println("Exce��o conhecida, mas ta blza");
			e.printStackTrace();
		}
		
		//N�O POSSO FAZER PQ A EXCE��O DEVE SER OBRIGATORIAMENTE TRATADA
		//Utilidades.get(valores, -5);
	
		System.out.println("Deu tudo certo... ou quase tudo");
	}

}
