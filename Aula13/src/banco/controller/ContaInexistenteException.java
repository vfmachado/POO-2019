package banco.controller;

public class ContaInexistenteException extends Exception {

	public ContaInexistenteException() {
		super("Esta conta não existe");
	}
	
}
