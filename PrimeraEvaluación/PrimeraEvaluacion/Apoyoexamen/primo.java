package Apoyoexamen;

import java.util.Scanner;

/*
 * Desarrolla un programa utilizando alguna de las estructuras de control que conoces,
capture un valor entero positivo y determine y muestre por pantalla si el nº
introducido es o no primo. Nota: Un nº es primo si es divisible únicamente por sí
mismo y por la unidad (el nº 1)
 */
public class primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, contador = 0;
		do {
			System.out.print("Introduce un número entero positivo: ");
			num = sc.nextInt();
		} while (num < 0);
		for (int i = 1; i <= num; i++) {
			{
				if (num % i == 0) {
					contador++;
				}
			}

		}if (contador == 2) {
			System.out.println("Tu numero " + num + " es primo");
		} else
			System.out.println("Tu numero " + num + " no es primo");
		
		sc.close();
	}

}