
public class Utilidades {

	//THROWS - lançar uma Exception
	//quem utiliza o método get deve tratar esta exceção!
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
