package excecoes;

public class Caso5 {

	public class Pessoa {
		String nome;
	}
	
	
	public static void main(String[] args) {

		Pessoa[] array = new Pessoa[3];
			
				try {
				
					System.out.println(array[0].nome);
					System.out.println("Cheguei até aqui");
				} catch (ArrayIndexOutOfBoundsException e1) {
					System.out.println("Cai na e1");
					
				} finally {
					System.out.println("O louco meu!!");
				}
			
		System.out.println("Terminei Programa");
	}

}
