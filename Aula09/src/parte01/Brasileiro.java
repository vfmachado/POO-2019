package parte01;

public class Brasileiro implements Falacao, Alimentacao {

	//implementa��o da interface falacao
	@Override
	public String falar() {
		return "Eu falo portugu�s";
	}

	//� a implementa��o da interface Alimenta��o
	@Override
	public String comidaPreferida() {
		return "Churrasco";
	}

	
	
}
