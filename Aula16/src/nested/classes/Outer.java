package nested.classes;

public class Outer {

	Inner inner;
	
	public Outer() {
		inner = new Inner();
	}
	
	public Inner getInner() {
		return inner;
	}
	
	public class Inner {
		
		public int x = 0;
		
		public String print() {
			return "Print da inner: " + x;
		}
		
	}
	
	public String print() {
		return "Print da outer";
	}
	
}
