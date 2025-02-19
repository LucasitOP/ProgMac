package Funciones;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int numero = solicitarNumero();
		pintarPorPantalla("Numero:"+muestranumero(numero));
		pintarPorPantalla("Es capicua:"+EsCapicua(numero));
		pintarPorPantalla("Es primo:"+EsPrimo(numero));
		pintarPorPantalla("Siguiente primo:"+SiguientePrimo(numero));
		pintarPorPantalla("Número invertido:"+Voltear(numero));
		}

//función solocita al usuario un número y lo devuelve
	public static int muestranumero(int numero) {
		return numero;
	}

//función esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	public static boolean EsCapicua(int numero) {
		int numeroinvertido;
		boolean respuesta = false;
		String cadena, cadinv = "";
		cadena = numero + "";
		for (int i = 0; i < cadena.length(); i++) {
			cadinv = cadena.charAt(i) + cadinv;
			{
				numeroinvertido = Integer.parseInt(cadinv);
				if (numero == numeroinvertido) {
					respuesta = true;
				} else {
					respuesta = false;

				}

			}
		}
		return respuesta;
	}

	public static int solicitarNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero = sc.nextInt();
		sc.close();
		return numero;
	}

	// función Devuelve verdadero si el número que se pasa como parámetro es primo y
	// falso en caso contrario
	public static boolean EsPrimo(int numero) {
		if (numero <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int SiguientePrimo(int numero) {
		int siguientePrimo = numero + 1;

		// Busca el siguiente número primo
		while (!EsPrimo(siguientePrimo)) {
			siguientePrimo++;
		}

		return siguientePrimo;
	}

	public static int Voltear(int numero) {
		int numeroinvertido = 0;
		String cadena, cadinv = "";
		cadena = numero + "";
		for (int i = 0; i < cadena.length(); i++) {
			cadinv = cadena.charAt(i) + cadinv;
			{
				numeroinvertido = Integer.parseInt(cadinv);
			}
		}
		return numeroinvertido;
	}
	 public static void pintarPorPantalla(String mensaje) {
	        System.out.println(mensaje);
	    }


}
