package Cuaderno_Arrays3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Solicitar repetidamente números por consola hasta que se introduzca el 0. En una
tabla de 5 elementos se deben almacenar los últimos 5 números. Cuando se
introduzca el 0 el sistema dejará de solicitar números y mostrará el contenido del
array
 */
public class ejercicio3OBSERVAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int numero = 1;
		do {
			System.out.println("Introduce el número o 0 para salir:");
			numero = sc.nextInt();
			sc.nextLine();
			boolean encontrar = false;
			if (numero != 0) {
				for (int j = 0; j < array.length; j++) {
					if (array[j] == 0) {

						array[j] = numero;
						j = array.length;
						encontrar = true;

					}
				}
				if (!encontrar) {
					for (int i = 0; i < array.length - 1; i++) {
						array[i] = array[i + 1];

					}
					array[array.length - 1] = numero;
				}
			}
		} while (numero != 0);
		System.out.println(Arrays.toString(array));

		sc.close();
	}

}
