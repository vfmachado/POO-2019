import java.util.ArrayList;

public class Conta {

	private String titular;
	private float saldo = 0;
	private float limite = 0;
	private ArrayList<Float> log;
	
	//CONSTRUTOR
	//MÉTODO CHAMADO QUANDO CRIAMOS O OBJETO
	//não necessita tipo de retorno nem a palavra chave return
	//tem o mesmo nome da classe
	public Conta(String nomeTitular) {
		titular = nomeTitular;
		log = new ArrayList<Float>();
	}
	
	public void depositar(float valor) {
		saldo += valor; //saldo = saldo + valor;
		log.add(valor);
	}
	
	public boolean sacar(float valor) {
		
		if (valor <= saldo + limite) {
			saldo -= valor;
			log.add(-valor);
			return true;
		}
		
		return false;
	}
		
	public float consultarSaldo() {
		return saldo;
	}
	
	
	public float consultarLimite() {
		return limite;
	}
	
	
	public float solicitarAumLim() {
		
		float media = 0, quant = 0;
		
		for (Float f : log) {
			if (f > 0) {
				quant++;
				media += f;
			}
		}
		
		media /= quant;
		media /= 2;
		
		limite = media;
		
		return limite;
	}
	
	
	public String consultarExtrato() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n-------------------------\n");
		sb.append("Ola " + titular + "\nSegue seu registro de operacoes");
		//estudar o for melhorado
		for (Float f : log) {
			if (f > 0) {
				sb.append("\n\tVoce depositou " + f);
			} else {
				sb.append("\n\tVoce sacou " + (-f));
			}
		}
		sb.append("\nSeu limite atual e de: R$" + limite);
		sb.append("\nSeu saldo atual e de:  R$" + saldo);
		sb.append("\n-------------------------\n");
		return sb.toString();
		
		
	}
	
	
	public String quemTitular() {
		return titular;
	}
}