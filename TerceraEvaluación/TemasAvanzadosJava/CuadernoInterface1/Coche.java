package CuadernoInterface1;

public class Coche implements IVehiculo {
	private double velocidadMaxima;
	private int capacidadPasajeros;
	
	
	public Coche(double velocidadMaxima,int capacidadPasajeros) {
		this.velocidadMaxima=velocidadMaxima;
		this.capacidadPasajeros=capacidadPasajeros;
	}
	
	@Override
	public double ObtenerVelocidadMaxima() {
		return velocidadMaxima;
	}

	@Override
	public boolean VerificarTransportePasajeros() {
		return this.capacidadPasajeros>0;
	}

}
