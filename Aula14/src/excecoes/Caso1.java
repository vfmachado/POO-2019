package excecoes;

public class Caso1 {

	public class Pessoa {
		String nome;
	}
	
	
	public static void main(String[] args) {

		Pessoa[] array = new Pessoa[3];
		//for (int i = 0; i < 5; i++) {
			try {
				
				try {
				//array[3] = "OI";
					System.out.println(array[0].nome);
				System.out.println("Cheguei até aqui");
				} catch (ArrayIndexOutOfBoundsException e1) {
					System.out.println("Cai na e1");
					//throw new ArrayIndexOutOfBoundsException();
				}
				
			} catch (NullPointerException e2) {
				System.out.println("Cai na exceção 2");
				//break;
			}
		//}

		System.out.println("Terminei Programa");
	}

}
