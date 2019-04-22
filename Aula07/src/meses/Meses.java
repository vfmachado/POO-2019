package meses;

public enum Meses {

	JANEIRO(31),
	FEVEREIRO(28),
	MARCO(31),
	ABRIL(30),
	MAIO(31),
	JUNHO(30),
	JULHO(31),
	AGOSTO(31),
	SETEMBRO(30),
	OUTUBRO(31),
	NOVEMBRO(30),
	DEZEMBRO(31);
	
	private int dias;
	
	private Meses(int dias) {
		this.dias = dias;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	
	public String bonitinho() {
		return name().toLowerCase();
	}
}
