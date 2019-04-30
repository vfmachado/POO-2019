package parte01;

public class Brasileiro implements Falacao, Alimentacao {

	//implementação da interface falacao
	@Override
	public String falar() {
		return "Eu falo português";
	}

	//é a implementação da interface Alimentação
	@Override
	public String comidaPreferida() {
		return "Churrasco";
	}

	
	
}
