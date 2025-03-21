package CuadernoInterface1;

public class manejadoraInterface {

	public static void main(String[] args) {
		IVehiculo[] vehiculos = new IVehiculo[3];
		vehiculos[0] = new Coche(240, 5);
		vehiculos[1] = new Moto(125);
		vehiculos[2] = new Bicicleta(30, true);

		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i].Datos() == null) {

			} else {
				System.out.println(vehiculos[i].Datos());
			}
		}
	}

}
