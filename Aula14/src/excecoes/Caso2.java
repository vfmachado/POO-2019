package excecoes;

public class Caso2 {

	public class Pessoa {
		String nome;
	}
	
	
	public static void main(String[] args) {

		Pessoa[] array = new Pessoa[3];
			try {
				//array[3] = "OI";
				System.out.println(array[3].nome);
				System.out.println("Cheguei até aqui");
			} catch (ArrayIndexOutOfBoundsException e1) {
					System.out.println("Cai na e1");
			} catch (NullPointerException e2) {
				System.out.println("Cai na exceção 2");
			}
		

		System.out.println("Terminei Programa");
	}

}
