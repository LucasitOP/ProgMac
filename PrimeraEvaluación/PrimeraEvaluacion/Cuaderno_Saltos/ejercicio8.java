package Cuaderno_Saltos;

import java.util.Scanner;

/*
 * Solicita un nº por teclado M , mostrar los los M primeros números impares
 */
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=0,contador=0;
		System.out.println("Dime un número");
		num=sc.nextInt();
		System.out.println("Los primeros "+num+" numeros impares son:");
		int primerimpar=1;

		while (contador< num) {
			for (int i=1;i<=primerimpar;i++) {
				if(primerimpar%2 !=0) {
					System.out.print(primerimpar+" ");
					contador++;			
					break;}
				
			}primerimpar++;

		}
	
sc.close();
}
}
