package parte02;

public class Ingles implements Idioma {

	@Override
	public String bemvindo() {
		return "Welcome";
	}

	@Override
	public String tchau() {
		return "Bye";
	}

	@Override
	public String qualSeuNome() {
		return "What is your name?";
	}

}
