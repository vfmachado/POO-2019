package meses;

public class Main {

	public static void main(String[] args) {
		
		for (Meses mes : Meses.values()) {
			System.out.println("O mes " + mes.bonitinho() + 
					" tem " + mes.getDias() + " dias");
		}
		
	}

}
