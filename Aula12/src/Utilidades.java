
public class Utilidades {

	//THROWS - lan�ar uma Exception
	//quem utiliza o m�todo get deve tratar esta exce��o!
	public static int get(int[] valores, int pos) throws MinhaExcecao {
		
		try {
			return valores[pos];
		} catch (Exception e) {
			throw new MinhaExcecao();
		}
	}

	
	public static void disparaExcecao(String msg)  throws Exception {
		
		throw new Exception(msg);
		
		
		
	}
}
