package RepasoArrays2;

import java.io.IOException;
import java.util.Scanner;

//Falta pedir bebida y rellenar bebidas
public class Bebidas {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[][] bebidas = { { "Capuccino", "Capuccino descafeinado", "Capuccino extra canela" },
				{ "Cafe solo", "Cafe solo descafeinado", "Cafe arabiga" },
				{ "Cafe moca", "Cafe moca descafeinado", "Cafe moca especial" },
				{ "Cafe con leche", "Cafe con leche descafeinado", "Leche manchada" },
				{ "Te negro", "Te verde con limon", "Te Chai con leche" },
				{ "Chocolate", "Chocolate con leche", "Chocolate light" } };
		/*
		 * int [][] id= { {00,01,02}, {10,11,12}, {20,21,22}, {30,31,32}, {40,41,42},
		 * {50,51,52} };
		 */

		// Error con el Arrays.fill(disponibles,20)
		int[][] disponibles = { { 01, 20, 20 }, { 20, 20, 20 }, { 20, 20, 20 }, { 20, 20, 20 }, { 20, 20, 20 },
				{ 20, 20, 20 } };
		// Creamos el array a partir de los anteriores y le damos valores, en caso de
		// que sea impar
		double[][] precios = new double[6][3];
		for (int i = 0; i < precios.length; i++) {
			for (int j = 0; j < precios[i].length; j++) {
				if (i + j % 2 == 0) {
					precios[i][j] = 0.75;
				} else {
					precios[i][j] = 0.55;
				}
			}
		}

		boolean continuar = true;

		do {
			mensaje();
			char opcion = (char) System.in.read();
			sc.nextLine();
			switch (opcion) {
			case 'M':
				MostrarBebidas(disponibles, precios, bebidas);
				break;
			case 'P':
				PedirBebida(sc, disponibles, bebidas);
				break;
			case 'R':
				break;
			case 'S':
				System.out.println("Salida!");
				continuar = false;
				break;
			default:
				System.out.println("Opción Errónea");
				break;
			}
		} while (continuar);

	}

	// Mensaje que se va a repetir
	public static void mensaje() {
		System.out.println("*********************************************************\r\n"
				+ "Bienvenid@ al sistema de Vending DAW1.\r\n" + "Selecciona una opción:\r\n"
				+ "M. Mostrar bebidas disponibles\r\n" + "P. Pedir bebida\r\n" + "R. Rellenar bebidas\r\n"
				+ "S. Salir\r\n" + "*********************************************************\r\n" + "");
	}

	public static void MostrarBebidas(int[][] disponible, double[][] precios, String[][] bebidas) {
		System.out.println("Bebidas disponibles");
		for (int k = 0; k < bebidas.length; k++) {
			for (int m = 0; m < bebidas[k].length; m++) {
				System.out.println(k + "" + m + "  " + "(" + disponible[k][m] + " disponibles) " + precios[k][m]
						+ " euros " + bebidas[k][m]);
			}
		}
	}

	public static void PedirBebida(Scanner sc, int[][] disponible, String[][] bebidas) {
		String mensaje = ("Introduce la posicion de la bebida");
		boolean repetirpedirbebida = true;
		do {
			System.out.println(mensaje);
			String opcion = sc.nextLine();
			int i = Integer.parseInt(opcion.substring(0, 1));
			int j = Integer.parseInt(opcion.substring(1, 2));
			System.out.println("Has introducido:" + i + "" + j);
			if (disponible[i][j] == 0) {
				System.out.println("No quedan bebidas disponibles");
				repetirpedirbebida = false;

			} else {
				System.out.println("La bebida seleccionada es:" + bebidas[i][j] + " y se ha podido servir");
				disponible[i][j] -= 1;
				repetirpedirbebida = false;
			}
		} while (repetirpedirbebida);

	}
	public static void RellenarBebida() {
		
	}

}
