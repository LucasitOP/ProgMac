package autoevaluaciónLucasTimoc;

import java.util.Scanner;
/*EN ESTE INTENTO SACAR
 *LOS DIVISORES UNICAMENTE CUANDO SON PERFECTOS.
 * 
 */
public class ejercicio1_BETA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		do {
			System.out.println("Introduce un número entero positivo");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("El número debe ser un entero positivo. Inténtalo de nuevo.");
			}
			/*
			 * Necesito contar los divisores del número ingresado y recogerlos para sacarlos
			 * por pantalla de manera que quitandole a sí mismo la suma de ellos sea el
			 * número.
			 */
			int divisores = 0;
			if (num != 0) {

				// System.out.print("Divisores:");
				for (int i = 1; i < num; i++) {
					if (num % i == 0) {
						divisores += i;
						if (divisores != num) {
							//System.out.println("El número no es perfecto");
						} else //if (divisores == num) {
						{
							System.out.println("Divisores:");
							for (int j = 1; j < num; j++) {
								if (num % j == 0) {
									
									System.out.print(j + " ");
								}
							}System.out.println("El número "+num+" es perfecto");
						} 
						
						}
					}
				
				}
			
			System.out.println("");

		} while (num != 0);
		System.out.println("Adiós!");

		sc.close();
	}
}
