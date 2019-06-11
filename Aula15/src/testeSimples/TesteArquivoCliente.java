package testeSimples;

import java.io.FileNotFoundException;
import java.util.Formatter;

import model.Cliente;
import model.Funcionario;

public class TesteArquivoCliente {

	public static void main(String[] args) {
	
		Cliente cliente = new Cliente();
		
		cliente.setNome("Vinicius machado");
		cliente.setCpf("123.123.123-12");
		cliente.setTelefone("(51) 9 9999-9999");
		
		//PRIMEIRA FORMA DE ESCREVER EM UM ARQUIVO
		//PENSAR NUM ARQUIVO COMO TEXTO PURO... E SALVAR TEXTO NESTE ARQUIVO
		
		Funcionario func = new Funcionario();
		func.setNome("Alexandre");
		func.setCpf("312.312.312.32");
		func.setTelefone("123123123");
		func.setMatricula(1);
		func.setSalario(3000);
		
		try {
			
			Formatter saida = new Formatter("dados.txt");
			
			saida.format("##Cliente\n%s\n%s\n%s\n",
					cliente.getNome(),
					cliente.getCpf(),
					cliente.getTelefone());
			
			saida.format("##Funcionario\n%s\n%s\n%s\n%d\n%f\n", 
					func.getNome(),
					func.getCpf(),
					func.getTelefone(),
					func.getMatricula(),
					func.getSalario());
			
			//libera o arquivo de texto
			saida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
