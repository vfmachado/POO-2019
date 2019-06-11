package testeObj;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class LeitorObjeto {

	public static void main(String[] args) {
		
		List<Cliente> cs = new ArrayList<Cliente>();
		
		try {
			ObjectInputStream input;
			
			InputStream stream = 
					Files.newInputStream(Paths.get("dadosObj.txt"));
			
			input = new ObjectInputStream(stream);
			
			cs = (ArrayList<Cliente>) input.readObject();
			
			for (Cliente c : cs) {
				System.out.println("\nCLIENTE NO ARQUIVO: \n\t" + c.getNome());
			}
			
			input.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
