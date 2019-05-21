
public class FuncionamentoFinally {

	public static void main(String[] args) {
		
		System.out.println(metodo1(6, 2));
		
	}

	public static int metodo1(int a, int b) throws ArithmeticException {
		boolean deuCerto = true;
		try {
			int res = a / b;
			return res;
		} catch (ArithmeticException e) {
			//trato mas lanço!!!
			deuCerto = false;
			throw e;	
		} finally {
			
			System.out.println("Encerrando o método =D");
			String res = deuCerto ? "Deu tudo certo" : "Acho que deu ruim!";
			System.out.println(res);
		}
		
		
	}
	
}
