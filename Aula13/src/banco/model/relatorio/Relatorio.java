package banco.model.relatorio;

public class Relatorio {

	private static int contador = 1;
	
	public static void gerarRelatorio(Imprimivel imprimivel) {
		System.out.println("Meu relatorio #" + contador++);
		System.out.println(imprimivel.mostraDados());	
	}
	
}
