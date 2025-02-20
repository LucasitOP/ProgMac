package Apoyoexamen;

/**
 ********************** PROBLEMA*********************************************************
 * Indicar si un número positivo leído es o no perfecto (la suma de los divisores menos el mismo número, es igual al número)
 * En caso de serlo se muestran sus divisores
 * 
 * **********************ANÁLISIS***************************************************************
 * Hay que solicitar repetidamente números hasta que se introduzca el cero. 
 *  Si el número es positivo, obtener e indicar si es perfecto
 *  Si es perfecto mostrar sus divisores
 *  
 *  Datos de entrada: número
 *  Datos de salida: es o no perfecto, si es perfecto los divisores
 *  Variables: numero (int) , sumadivisores(int), divisores (String) 
 *  
 * ***********************DISEÑO***********************************************************
 *  1) Solicitar numero
 *  2) Si es positivo obtener si es perfecto, si lo es mostrar divisores .  Repetir 1
 *  3) Si es negativo repetir 1)
 *  4) si es cero salir 
 *  
 */
import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		String divisores = "";
		int sumaDivisores=0;
		
		do {
			// Bucle para solicitar un número entero positivo
			do {
				System.out.print("Introduce un número entero positivo: ");
				numero = sc.nextInt();

				if (numero < 0) // Si el número es menor a cero, pedir otro número
				{
					System.out.println("El número debe ser un entero positivo. Inténtalo de nuevo.\n");
				}
			} while (numero < 0); // Repetir hasta que el número sea positivo

			if (numero != 0) { // si es cero salimos y no debemos comprobar nada
				 sumaDivisores = 0;// Inicializamos la suma de divisores propios a 0
				 divisores = "";// Inicializamos la cadena donde vamos guardando los divisores
				for (int i = 1; i < numero; i++)  // Bucle para obtener los divisores
				{
					if (numero % i == 0) { // Si 'i' es divisor propio
						sumaDivisores += i; // vamos sumando cada divisor
						divisores += i + " "; // Vamos guardando el divisor para mostrarlo si es perfecto
					}
				}
				
				if (sumaDivisores == numero)// Comprobamos si la suma de los divisores es igual al número
				{
					System.out.println("El número " + numero + " es perfecto.");
					System.out.println("Divisores: " + divisores);
				} else {
					System.out.println("El número " + numero + " no es perfecto.");
				}
				System.out.println();
				
				
			}
		} while (numero != 0); // Si es cero salir
		System.out.println("Adiós!");
		sc.close();
	}
}
