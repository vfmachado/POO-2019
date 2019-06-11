package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import model.Cliente;
import model.Loja;

public class GravadorArquivos {

	public static void gravaArquivo(Loja loja, String filename) throws Exception {

		// declaracao
		ObjectOutputStream out; // saída para objetos em java

		// onde vai ser feito essa saída
		OutputStream outstream = Files.newOutputStream(Paths.get(filename));
		// no arquivo dadosObj.txt

		// inicializa o ObjectOutputStream
		out = new ObjectOutputStream(outstream);

		out.writeObject(loja);

		out.close();
	}

	
	public static Loja carregaArquivo(String filename) throws Exception {
		
		ObjectInputStream input;
		
		InputStream stream = 
				Files.newInputStream(Paths.get(filename));
		
		input = new ObjectInputStream(stream);
		
		Loja loja = (Loja) input.readObject();
		
		input.close();
		
		return loja;
	}
	
}
