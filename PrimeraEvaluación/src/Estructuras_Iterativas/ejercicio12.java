package Estructuras_Iterativas;

import java.util.Scanner;

/*
 * Introducir un número entero por teclado. El programa debe calcular y mostrar por
pantalla todos los números pares entre el 1 y el número introducido por teclado.
Debe comprobar que el número introducido es mayor que 1, en caso contrario debe
solicitar el nº indefinidamente.
 */
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Introduce un número entero");
			num = sc.nextInt();
		} while (num < 1);
		for (int i = 2; i <= num; i += 2) {
			System.out.println(i);
		}
		System.out.println(num);

		sc.close();
	}

}
