package testeObj;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ArquivoObjectEscrita {

	public static void main(String[] args) {

		List<Cliente> cs = new ArrayList<Cliente>();
		
		Cliente c = new Cliente();
		
		c.setNome("Vinicius");
		c.setCpf("123123");
		c.setTelefone("99999");
		
		cs.add(c);
		
		c = new Cliente();
		c.setNome("Cris");
		c.setCpf("123");
		c.setTelefone("321");
		
		cs.add(c);
		
		
		try {
			//declaracao
			ObjectOutputStream out; //saída para objetos em java
			
			//onde vai ser feito essa saída
			OutputStream outstream = Files.newOutputStream(Paths.get("dadosObj.txt"));
									//no arquivo dadosObj.txt
			
			//inicializa o ObjectOutputStream
			out = new ObjectOutputStream(outstream);
			
			out.writeObject(cs);
			
			out.close();
			System.out.println("\n\t **Finalizado com sucesso** ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
