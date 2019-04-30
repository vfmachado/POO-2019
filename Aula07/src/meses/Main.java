package meses;

public class Main {

	public static void main(String[] args) {
		
		Meses janeiro = Meses.JANEIRO;
		System.out.println("Janeiro tem " + janeiro.getDias() + " dias");
		
		for (Meses mes : Meses.values()) {
			System.out.println("O mes " + mes.bonitinho() + 
					" tem " + mes.getDias() + " dias");
		}
		
	}

}
