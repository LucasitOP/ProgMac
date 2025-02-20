package Cuaderno_Saltos;

import java.util.Scanner;

/*
 * Solicitar el día de la semana en el que nos encontramos (del 1 al 7), ejecutar un bucle for que
muestre por consola cada día pero en este caso en lugar de detenerse el bucle al llegar al
coincidir el día como pasaba con break, lo que se hace es pasar al día siguiente sin hacer
nada.
 */
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		System.out.println("Dime el día de la semana");
		dia = sc.nextInt();
		String mensaje="";
		for (int i = 1; i <= 7; i++) {
			switch (i) {
			case 1:
				mensaje="Lunes";
				break;
			case 2:
				mensaje="Martes";
				break;
			case 3:
				mensaje="Miercoles";
				break;
			case 4:
				mensaje="Jueves";
				break;
			case 5:
				mensaje="Viernes";
				break;
			case 6:
				mensaje="Sabado";
				break;
			case 7:
				mensaje="Domingo";
				break;
			
				
				}
			if (dia == i) {
					continue;}		
			System.out.println(mensaje);

		}
	
		sc.close();
	}

}
	
