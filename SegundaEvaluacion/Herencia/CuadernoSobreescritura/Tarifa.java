package CuadernoSobreescritura;

public enum Tarifa {
RATA(6),MONO(12),BISONTE(30);
	private int coste;
	
	Tarifa(int coste) {
this.coste=coste;	
}

	public int getCoste() {
		return coste;
	}
	
}
