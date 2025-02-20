package EstructurasAlternativas;

import java.util.Scanner;

/*Realiza un algoritmo que calcule la potencia, para ello pide por teclado la
base y el exponente. Pueden ocurrir tres cosas:
● El exponente sea positivo, sólo tienes que imprimir la potencia.
(Nota : utiliza para ello Math.pow(base, exponente) )
● El exponente sea 0, el resultado es 1.
● El exponente sea negativo, el resultado es 1/potencia con el
exponente positivo. 
 */
public class ejercicio2 {
	/* Analisis 
	 * Algoritmo que calcule la potencia mediante la peticion de un numero por
	 * pantalla y la funcion Math.pow de java
	 * 
	 * Diseño
	 * Ingresamos el Scanner
	 * Declaramos e inializamos las variables
	 * Pedimos los datos (base, exponente)
	 * Realizamos los 3 casos posibles mediante if y else y sacamos por pantalla 
	 * el resultado de la potencia
	 * 	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = 0, exponente = 0;
		double resultado = 0;
		System.out.println("Dime la base");
		base = sc.nextInt();
		System.out.println("Dime el exponente");
		exponente = sc.nextInt();

		if (exponente == 0) {

			System.out.println("El resultado es: 1");
		} else if (exponente > 0) {
			resultado = (int) Math.pow(base, exponente);
			System.out.println("El resultado es:" + resultado);

		} else {
			resultado=1/Math.pow(base, exponente);
			System.out.println("El resultado es:"+resultado);
		}

			sc.close();
	}

}
