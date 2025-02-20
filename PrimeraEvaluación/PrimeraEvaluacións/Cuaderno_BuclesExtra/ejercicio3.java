package Cuaderno_BuclesExtra;

import java.util.Scanner;

/*
 * Desarrolla un programa que solicite un número N por teclado y muestre el factorial de ese
número


Analisis:
Necesitamos un programa que en un bucle reciba un numero entero y muestre el resultado de su factorial
Ejemplo: 4!= 1*2*3*4=24 
Necesitaremos un contador que realice la multiplicación
y bucles que relacionen la incrementación desde 0 al numero que ingrese el usuario.
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0;
		// Do while que obligará al usuario a que sea un numero entero positivo
		do {
			System.out.print("Introduce un número entero positivo: ");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("El número debe ser positivo. Inténtalo de nuevo.");
			}
		} while (num< 0);
		int contadormulti=1;
		for (int i=1;i<=num;i++) {
			contadormulti*=i;
		}
		System.out.println("El factorial de "+num+" es:"+contadormulti);
		
		
	sc.close();}

}
