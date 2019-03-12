import java.util.Formatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Files; 
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListaEmails {

	public static void main(String[]args) throws Exception {
		
		final Path CAMINHO_ARQUIVO = Paths.get("arquivos/emails.vfm");
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> emails = new ArrayList<String>();
	
		if (Files.exists(CAMINHO_ARQUIVO)) {
			//carrego os dados no arrayList
			Scanner leitorArquivo = new Scanner(CAMINHO_ARQUIVO);
			while (leitorArquivo.hasNextLine()) {
				emails.add(leitorArquivo.nextLine());
			}
			leitorArquivo.close();
		}
		
		int opcao;
		do {
			System.out.println("Informe a opção desejada: \n"
			 + "\t1. Cadastrar Email\n"
			 + "\t2. Ver Lista\n"
			 + "\t3. Remover Email\n"
			 + "\t4. Sair\n");
	

			opcao = in.nextInt();
			in.nextLine();
		
			switch (opcao) {
				
				case 1:
					String email = in.nextLine();
					Formatter saida = new Formatter("arquivos/emails.vfm");
					emails.add(email);
					for (String s: emails) {
						saida.format("%s\n", s);
					}
					saida.close();
				break;
				case 2:
					System.out.println(emails.toString());
				break;
				case 3:
				break;
				case 4:
				break;
				default:
					System.out.println("Numero entre 1 e 4");
				
				
				
			}
		} while(opcao != 4);
	
	}
}