package ex02;

public class Main02 {

	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa("Vinicius");
		
		Pessoa pai = new Pessoa("Idailson");
		Pessoa mae = new Pessoa("Maria");
		p0.setPai(pai);
		p0.setMae(mae);
		
		Pessoa maePai = new Pessoa("Iara");
		pai.setMae(maePai);
		
		Pessoa maeMae = new Pessoa("Valéria");
		Pessoa paiMae = new Pessoa("Afonso");
		mae.setMae(maeMae);
		mae.setPai(paiMae);
		
		mostraArvore(p0, 0);
	}
	
	
	public static void mostraArvore(Pessoa p, int nivel) {
		
		for  (int i = 0; i < nivel; i++)
			System.out.print('\t');
		
		System.out.println(p.getNome());
		
		if (p.getPai() != null)
			mostraArvore(p.getPai(), nivel+1);
		
		if (p.getMae() != null)
			mostraArvore(p.getMae(), nivel+1);
		
	}
}
