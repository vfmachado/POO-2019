package generics;

public class Par<Tipo1, Tipo2> {

	private Tipo1 variavel1;
	private Tipo2 variavel2;
	
	public Par() {
		
	}
	
	public Tipo1 getVariavel1() {
		return variavel1;
	}
	public void setVariavel1(Tipo1 variavel1) {
		this.variavel1 = variavel1;
	}
	public Tipo2 getVariavel2() {
		return variavel2;
	}
	public void setVariavel2(Tipo2 variavel2) {
		this.variavel2 = variavel2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return variavel1.toString() +"\t"+ variavel2.toString();
	}
	
}
