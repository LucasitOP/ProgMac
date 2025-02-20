package EstructurasAlternativas;

import java.util.Scanner;

public class ejercicio1 {
/*Analisis
 * Tenemos que recoger un numero por pantalla y decir si es par o impar
 * 
 * Diseño
 * Pediremos por pantalla el numero de tipo int y realizaremos la función %2 si el resultado es 0 
 * significa que el numero es par en caso de que no, seria impar.
 * 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero = 0;
		System.out.println("Dime tu numero");
		numero=sc.nextInt();
		if (numero%2==0) {
			System.out.println("Tu numero es par");
		}
		else {
			System.out.println("Tu numero es impar");
		}
	sc.close();}

}
