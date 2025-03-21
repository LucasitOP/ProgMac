package Estructuras_Iterativas;

import java.util.Scanner;
/*
 * Crea un programa que pinte una escalera de números, siendo cada línea un número.
 */
public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Escribe un número");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}				System.out.println();


			sc.close();
		}

	}
}
