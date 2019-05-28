package banco.controller;

public class ContaJaExisteException extends Exception {
	
	public ContaJaExisteException() {
		super("Esta conta já existe...");
	}

}
