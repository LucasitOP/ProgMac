package EstructurasAlternativas;

import java.util.Scanner;

/*Diseñe un programa que lea un número entero (positivo o negativo) y
determine si tiene 1, 2,3, 4 o más cifras, visualizando lo que corresponda
 * Analisis
 * 
 * Diseño
 */
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, numerocifras = 0;
		System.out.println("Dime un número");
		numero = sc.nextInt();
		numerocifras = Math.abs(numero);
		if (numerocifras < 10) {
			System.out.print("Tu número tiene 1 cifra");
		} else if (numerocifras < 100) {
			System.out.println("Tu número tiene 2 cifras");
		} else if (numerocifras < 1000) {
			System.out.println("Tu número tiene 3 cifras");

		} else {
			System.out.println("Tu número tiene 4 cifras o más");
		}

		sc.close();
	}

}
