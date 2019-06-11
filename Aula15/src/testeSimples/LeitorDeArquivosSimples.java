package testeSimples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;

public class LeitorDeArquivosSimples {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		//FORMA MAIS "SIMPLES" DE LER UM ARQUIVO
		try {
			Scanner in = new Scanner(new File("dados.txt"));
		
			while (in.hasNext()) {
				
				String line = in.nextLine();
				
				if (line.contains("##Cliente")) {
					Cliente cli = new Cliente();
					cli.setNome(in.nextLine());
					cli.setCpf(in.nextLine());
					cli.setTelefone(in.nextLine());
					
					clientes.add(cli);
					
				} else if (line.contains("##Funcionario")) {
					in.nextLine();
					in.nextLine();
					in.nextLine();
					in.nextLine();
					in.nextLine();
				}
			
			}
		} catch (FileNotFoundException e) {
			
		}
		
		System.out.println("Lista de clientes carregados:");
		int i = 0;
		for (Cliente c : clientes) {
			System.out.println(++i + ": " + c.getNome());
		}
		
	}

}
