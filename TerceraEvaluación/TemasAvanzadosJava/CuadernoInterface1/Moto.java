package CuadernoInterface1;

public class Moto implements IVehiculo {
	private double velocidadMaxima;
	
	public Moto(double velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	
	
	@Override
	public double ObtenerVelocidadMaxima() {
		return velocidadMaxima;
	}

	@Override
	public boolean VerificarTransportePasajeros() {
		return false;
	}
	@Override
	public String Datos() {
		return "La velocidad máxima es:"+ObtenerVelocidadMaxima()+" Y este vehiculo no permite llevar pasajeros.";
	}
}
