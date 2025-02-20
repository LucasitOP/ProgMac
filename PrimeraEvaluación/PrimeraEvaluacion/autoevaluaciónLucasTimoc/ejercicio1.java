package autoevaluaciónLucasTimoc;

import java.util.Scanner;
/*
 * ALGORITMO QUE SACA LOS DIVISORES DE TODOS LOS NUMEROS INGRESADOS (PERFECTOS O NO)
 * Y EN CASO DE SER PERFECTO LO DICE, EN CASO DE NO SERLO SALTA Y NO DICE NADA.
 */
public class ejercicio1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		do {
			System.out.println("Introduce un número entero positivo");
			num=sc.nextInt();
			if (num<0){
				System.out.println("El número debe ser un entero positivo. Inténtalo de nuevo.");
				}else {
				/*Necesito contar los divisores del número ingresado y recogerlos para sacarlos por
				 * pantalla de manera que quitandole a sí mismo la suma de ellos sea el número.
				 */
				int divisores=0;
				if(num!=0) {
		
				System.out.print("Divisores:");
				for(int i=1;i<num;i++) {
					if (num%i==0) {
						divisores+=i;
					System.out.print(i+" ");
					if(divisores!=num) {
						continue;
					}else if(divisores==num){
						System.out.print("El número es perfecto");
						break;
					}else {System.out.println("El número no es perfecto");
					} }
				}
				}
				System.out.println("");
				}
			
		}while (num!=0);
		System.out.println("Adiós!");		
		
	sc.close();}
}
