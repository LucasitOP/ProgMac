package Cuaderno1Vehi;
public class CrearObjetoVehiculo {

	public static void main(String[] args) {
		Vehiculo monovolumen= new Vehiculo();
		monovolumen.marca="Renault";
		monovolumen.modelo="Space";
		monovolumen.numpasajeros=7;
		monovolumen.capacidad=50;
		monovolumen.consumo=14;
		System.out.println("La autonomia de "+monovolumen.marca+" es:"+monovolumen.calcularAutonomia()+" km");
		
	/*
		//Autonomía = capacidad*consumo
		double Autonomía=monovolumen.capacidad*monovolumen.consumo;
		System.out.println("La autonomía de "+monovolumen.marca+" es:"+Autonomía);
	*/
	Vehiculo Deportivo=new Vehiculo();
	Deportivo.marca="Lexus";
	Deportivo.modelo="F Sport";
	Deportivo.numpasajeros=2;
	Deportivo.capacidad=66;
	Deportivo.consumo=18.8;
	/*
	 * double Autonomía=Deportivo.capacidad*Deportivo.consumo;
	 * 		System.out.println("La autonomía de "+Deportivo.marca+" es:"+Autonomía);

	 */
	
	System.out.println("La autonomia de "+Deportivo.marca+" es:"+Deportivo.calcularAutonomia()+" km");	 
	}

}
