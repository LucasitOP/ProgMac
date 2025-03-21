package Ev2_LucasAdriánTimoc;
//Enumerado (ya que es constante) del tipo de casco y con el atributo encapsulado del descuento 
//que se realizará posteriormente
public enum TipoDeCasco {
REDONDEADO(0.10),QUILLA(0.20),PLANO(0);
	private double descuento;
	
	 TipoDeCasco(double descuento) {
	this.descuento=descuento;
	}

	public double getDescuento() {
		return descuento;
	}
	
}
