
package model;

public class Secretaria  extends Pessoa {

//atributo ou método estático pertence a classe e não ao objeto.... todos os objetos compartilham da mesma informação
	private static double salario;
	
	public Secretaria(String nome, String cpf) {
		super(nome, cpf);
		this.email = "sec@sec.com.br";
	}
	
	public static void setSalario(double salario) {
		Secretaria.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return "Sou um(a) secretari@\t" + super.toString() + " meu salario e' " + this.salario;
	}
}