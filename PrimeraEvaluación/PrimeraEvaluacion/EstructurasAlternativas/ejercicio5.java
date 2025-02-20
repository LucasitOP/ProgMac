package EstructurasAlternativas;

import java.util.Scanner;
/*
 * Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es
bisiesto si es un número divisible por 4, pero no si es divisible por 100,
excepto que también sea divisible por 400.

Analisis


Diseño


 */
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int anyo=0;
		System.out.print("Dime el año:");
		anyo=sc.nextInt();
		
		if (anyo%4==0 && anyo%100!=0 || anyo%400==0)
			{System.out.println("El año es bisiesto");
			
		}else
		System.out.println("El año no es bisiesto");
		
		
	sc.close();}

}
