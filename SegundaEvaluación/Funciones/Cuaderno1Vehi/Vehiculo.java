package Cuaderno1Vehi;

public class Vehiculo {
	String marca,modelo;
	int numpasajeros=4,capacidad;
	double consumo;
	
	/*
	 * Duda de la formula
	 * No sería 
	 * consumo= 100km
	 * capacidad= x
	 * x=(100*capacidad)/consumo
	 * 
	 */
	float calcularAutonomia() {
		return (float) (capacidad*consumo);	
	}
}

