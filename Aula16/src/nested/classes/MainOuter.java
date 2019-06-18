package nested.classes;

import nested.classes.Outer.Inner;

public class MainOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		System.out.println(outer.print());
		
		
		System.out.println("Inner 1:");
		outer.getInner().x = 10;
		System.out.println(outer.getInner().print());
		
		
		System.out.println("Inner 2:");
		
		//instanciar a inner
		Outer.Inner inner = outer. new Inner();
		
		mostrar(inner);
		
		
		System.out.println(outer.getInner().print());
		
		
		
	}

	
	public static void mostrar (Inner inner) {
		
		System.out.println(inner.print());
		
	}
}
