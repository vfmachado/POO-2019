package parte01;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		//Brasileiro br = new Brasileiro();
		//System.out.println(br.falar());
		//System.out.println(br.comidaPreferida());
		
		//Falacao falacao = (Falacao) Class.forName("Ingles");
		//SUPER BONUS - A MAIORIA DOS PROFESSORES NÃO MOSTRAM
		//Class classeEmTempodeExecucao = Class.forName("parte01.Alemao");
		//Falacao falacao = (Falacao) classeEmTempodeExecucao.newInstance();
		//System.out.println(falacao.falar());
	
		//System.out.println(falacao.sayHi());
		
		Alimentacao objImplAlimentacao[] = new Alimentacao[2];
		objImplAlimentacao[0] = new Brasileiro();
		objImplAlimentacao[1] = new Cachorro();
		
		for (int i = 0; i < 2; i++) {
			System.out.println(objImplAlimentacao[i].getClass().getSimpleName());
			System.out.println(objImplAlimentacao[i].comidaPreferida());
		}
		
	}

}
