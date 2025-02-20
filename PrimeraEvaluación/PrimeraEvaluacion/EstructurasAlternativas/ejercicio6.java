package EstructurasAlternativas;

import java.util.Scanner;

/*Determine el menor valor de 5 números introducidos por teclado. Considere
que el menor valor puede repetirse. Por ejemplo: Si los números
introducidos fueran. 14, 19, 14, 16 y 15. El menor valor introducido es 14.
Analisis 

Diseño
 * 
 */
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, minimo = 0;
		System.out.print("Numero 1:");
		num1 = sc.nextInt();
		System.out.print("Numero 2:");
		num2 = sc.nextInt();
		System.out.print("Numero 3:");
		num3 = sc.nextInt();
		System.out.print("Numero 4:");
		num4 = sc.nextInt();
		System.out.print("Numero 5:");
		num5 = sc.nextInt();

		minimo = num1;
		if (minimo > num2) {
			minimo = num2;
		}

		if (minimo > num3) {
			minimo = num3;
		}
		if (minimo > num4) {
			minimo = num4;
		}
		if (minimo > num5) {
			minimo = num5;
		}
		System.out.println("El menor es:" + minimo);

		sc.close();
	}

}
