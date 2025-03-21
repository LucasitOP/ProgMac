package ExcepcionesPropias;

public enum Cuota {
	//Creamos un enum para saber lo que tienen que pagar cada Persona en su poliza
TREINTA(40),CUARENTA(50),CINCUENTA(60),SESENTA(70),RESTO(80);
	
	private int pago;
	
	Cuota(int pago){
		
		this.pago=pago;
	}
	public int getPago() {
		return pago;
	}
}
