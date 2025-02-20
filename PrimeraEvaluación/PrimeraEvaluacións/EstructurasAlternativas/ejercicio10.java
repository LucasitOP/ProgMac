package EstructurasAlternativas;

import java.util.Scanner;

/*Una compañía de transporte internacional tiene servicio en algunos países de
América del Norte, América Central, América del Sur, Europa y Asia. El costo
por el servicio de transporte se basa en el peso del paquete y la zona a la que
va dirigido. Lo anterior se muestra en la tabla:
Zona Ubicación Costo/gramo
1 América del Norte 24.00 euros
2 América Central 20.00 euros
3 América del Sur 21.00 euros
4 Europa 10.00 euros
5 Asia 18.00 euro
Parte de su política implica que los paquetes con un peso superior a 5 kg no
son transportados, esto por cuestiones de logística y de seguridad.
Realice un algoritmo para determinar el cobro por la entrega de un paquete o,
en su caso, el rechazo de la entrega
 * 
 */
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gramos = 0, zona = 0;
		double cobro = 0;
		System.out.println("¿Cuántos gramos de mercancia se quiere transportar?");
		gramos = sc.nextInt();

		if (gramos < 5000) {
			System.out.println(
					"¿A donde se quiere se quiere transportar?\n1:América del norte\n2:América Central\n3:América del sur\n4:Europa\n5:Asia");
			zona = sc.nextInt();
			switch (zona) {
			case 1:
				cobro = 24;
				break;
			case 2:
				cobro = 20;
				break;
			case 3:
				cobro = 21;
				break;
			case 4:
				cobro = 10;
				break;
			case 5:
				cobro = 18;
				break;
			default:
				System.out.println("ERROR EN LA SELECCIÓN DE PAÍS");

				break;
			}
			System.out.println("Tu paquete será entregado y su coste sera de:" + (gramos*cobro) + " euros");
		} else
			System.out.println("Tu paquete será rechazado por que su peso es superior a 5kg");

		sc.close();
	}

}
