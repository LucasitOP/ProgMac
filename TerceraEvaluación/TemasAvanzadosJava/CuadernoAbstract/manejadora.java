package CuadernoAbstract;

import java.util.Scanner;

public class manejadora {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean continuar = true;

		while (continuar) {
			char opcion = mostrarMenu();
			realizarOperacion(opcion);
			continuar = deseaContinuar();
		}

		System.out.println("Programa finalizado.");
		scanner.close();
	}

	private static char mostrarMenu() {
		String opcion = "";
		char opcionChar = ' ';

		while ("srmd".indexOf(opcionChar) == -1) {
			System.out.println("Seleccione la operación que quieres realizar:");
			System.out.println("s -> Suma");
			System.out.println("r -> Resta");
			System.out.println("m -> Multiplicación");
			System.out.println("d -> División");
			opcion = scanner.next().toLowerCase();
			opcionChar = opcion.charAt(0);
		}

		return opcionChar;
	}

	private static void realizarOperacion(char tipoOperacion) {
		double valor1 = pedirNumero("Introduce el primer número: ");
		double valor2 = pedirNumero("Introduce el segundo número: ");
		
		if(tipoOperacion=='d' && valor2==0) {
			System.out.println("No se puede dividir entre 0");
			valor2 = pedirNumero("Introduce el segundo número");
		}
		Operacion operacion = crearOperacion(tipoOperacion, valor1, valor2);

		if (operacion != null) {
			try {
				System.out.println("El resultado de la operacion es: " + operacion.operar());
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static double pedirNumero(String mensaje) {
		double numero;
		while (true) {
			System.out.print(mensaje);
			String input = scanner.next().trim();
			scanner.nextLine();
			try {
				numero = Double.parseDouble(input);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor numérico.");
			}
		}
		return numero;
	}

	private static Operacion crearOperacion(char tipoOperacion, double valor1, double valor2) {
		switch (tipoOperacion) {
		case 's':
			return new suma(valor1, valor2);
		case 'r':
			return new resta(valor1, valor2);
		case 'm':
			return new multiplicacion(valor1, valor2);
		case 'd':
			return new division(valor1, valor2);
		default:
			return null;
		}
	}

	private static boolean deseaContinuar() {
		String respuesta = "";

		while (!respuesta.equals("s") && !respuesta.equals("n")) {
			System.out.print("Deseas realizar otra operación? (S/N): ");
			respuesta = scanner.next().toLowerCase();
		}

		return respuesta.equals("s");
	}

}
