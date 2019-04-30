package parte02;

/**
 * Interface que define todas as msgs para a aplica��o em um idioma
 * Veja um exemplo em: <ul>
 *	<li>{@link Portugues}</li>
 *</ul>
 * @author fritz
 *
 */
public interface Idioma {

	/**
	 * Essa fun��o/m�todo serve para chamar a msg de boas vindas.
	 * @return uma String com o texto da msg
	 */
	String bemvindo();
	
	String tchau();
	
	String qualSeuNome();
		
}
