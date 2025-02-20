package Cuaderno_Saltos;

import java.util.Scanner;

/*
 * Solicitar el día de la semana en el que nos encontramos (del 1 al 7), ejecutar un bucle for que
muestre por consola cada día pero en este caso en lugar de detenerse el bucle al llegar al
coincidir el día como pasaba con break, lo que se hace es pasar al día siguiente sin hacer
nada.
 */
public class ejercicio4TERMINAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		System.out.println("Dime el día de la semana");
		dia = sc.nextInt();
		for (int i = 1; i <= 7; i++) {
			switch (i) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			}
			if (dia == i) {
				//System.out.println("Coincide con tu día");
				continue;

			}
		}
		sc.close();
	}

}
