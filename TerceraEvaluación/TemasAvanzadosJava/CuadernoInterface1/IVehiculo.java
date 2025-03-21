package CuadernoInterface1;

public interface IVehiculo {

	
	double ObtenerVelocidadMaxima();
	boolean VerificarTransportePasajeros();
	default String Datos() {
		return "Velocidad Máxima:"+ObtenerVelocidadMaxima()+ " Se ha verificado y ha dado resultado:"+VerificarTransportePasajeros()+" , de si se puede transportar";
	}
}
