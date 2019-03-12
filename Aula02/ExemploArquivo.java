import java.lang.Exception;
import java.nio.file.DirectoryStream;
import java.nio.file.Files; 
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class ExemploArquivo {

	public static void main(String[] args) throws Exception {
		//showInputDialog - mostra uma msg tipo alerta com input para o usuário. O que o usuário digitar retorna no formato de String
		String textoDigitado = JOptionPane.showInputDialog("Informe o caminho do arquivo");
	
		System.out.println("O caminho digitado foi: " + textoDigitado);
	
		Path caminho = Paths.get(textoDigitado); 
	
		if (Files.exists(caminho)) {
			System.out.println("Encontrado... isso existe");
			
			String caminhoAbsoluto = caminho.toAbsolutePath().toString();
			System.out.println("Caminho Absoluto: " + caminhoAbsoluto);
			
			if (Files.isDirectory(caminho)) {
				DirectoryStream<Path> dirStream =
					Files.newDirectoryStream(caminho);
					
				for (Path c : dirStream) {
					
				}				
			}
			
		} else {
			System.out.println("Verifique o caminho digitado");
		}
	}
}
