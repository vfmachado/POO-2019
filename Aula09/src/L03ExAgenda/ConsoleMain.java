package L03ExAgenda;

public class ConsoleMain {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		Contato c = new Contato("Vinicius", "123123");
		c.setEndereco("Pelotas, Rua 3, Visc da Graça");
		//escreva(c);
		agenda.add(c);
		
		Empresa ifrs = new Empresa();
		ifrs.setNome("IFRS - Campus Osorio");
		ifrs.setCnpj("123312");
		
		ContatoProfissional cprof = new ContatoProfissional("Fernanda", "567");
		cprof.setEmpresa(ifrs);
		cprof.setIntimidade(8);
		agenda.add(cprof);
		
		ContatoProfissional cprof2 = new ContatoProfissional("Vitor", "987");
		cprof2.setEmpresa(ifrs);
		agenda.add(cprof2);
		
		
		escreva(agenda);
		
		escreva("\n\nApenas os prof:");
		escreva(agenda.filtraProfisssionais());
		
		escreva("\n\nApenas com letra V:");
		escreva(agenda.filtraPorNome('V'));
	}
	
	public static void escreva(Object obj) {
		System.out.println(obj);
	}

}
