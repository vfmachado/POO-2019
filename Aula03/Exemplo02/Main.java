
public class Main {

	public static void main(String[] args) {
	
		//é o mesmo que
		//Conta conta;
		//conta = new Conta("Vinicius");
		Conta conta = new Conta("Vinicius");
		
		System.out.println("Seu saldo e de : " + conta.consultarSaldo());
		
		conta.depositar(1000);
		
		System.out.println("Seu saldo e de : " + conta.consultarSaldo());
		
		conta.sacar(300);
		
		System.out.println("Seu saldo e de : " + conta.consultarSaldo());
		
		
		conta.solicitarAumLim();
		
		conta.sacar(1000);
		
		System.out.println(conta.consultarExtrato());
	
	
		Conta conta2 = new Conta("Cristiana");
	
	}
}