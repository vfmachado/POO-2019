package parte02;

public class Portugues implements Idioma {

	@Override
	public String bemvindo() {
		return "Bem vindo";
	}

	@Override
	public String tchau() {
		return "Até mais";
	}

	@Override
	public String qualSeuNome() {
		return "Qual seu nome?";
	}

}
