package CuadernoInterface1;

public class Bicicleta implements IVehiculo {
	private double velocidadMaxima;
	private boolean tieneAsientoPasajero;
	public Bicicleta(double velocidadMaxima,boolean tieneAsientoPasajero) {
		this.velocidadMaxima=velocidadMaxima;
		this.tieneAsientoPasajero=tieneAsientoPasajero;
	}
	
	@Override
	public double ObtenerVelocidadMaxima() {
		return velocidadMaxima;
	}

	@Override
	public boolean VerificarTransportePasajeros() {
		return tieneAsientoPasajero;
	}

}
