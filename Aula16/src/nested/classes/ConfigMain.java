package nested.classes;

public class ConfigMain {

	public abstract class Car {
		
		public abstract String getModelo();
		
	}
	
	public static void main(String[] args ) {
		
		System.out.println(Config.BD.local);
		System.out.println(Config.possibleHosts.localhost.getValue());
		
		
		Car hondaCivic = new ConfigMain().new Car() {
			
			@Override
			public String getModelo() {
				return "Carro Honda... " + this.getClass().getName();
			}
		};
		
		System.out.println(hondaCivic.getModelo());
		
		
	}
	
}
