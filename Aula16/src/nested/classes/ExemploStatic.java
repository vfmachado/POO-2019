package nested.classes;

public class ExemploStatic {

	static int y = 0;
	
	public static class A {
		
		int x = 0;
		
		public void addX() {
			x++;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.addX();
		a1.addX();
		System.out.println(a1.x);
		
		A a2 = new A();
		a2.addX();
		System.out.println(a2.x);
		
		ExemploStatic ex1 = new ExemploStatic();
		ex1.y = 10;
		
		System.out.println(ExemploStatic.y);
		
	}
}
