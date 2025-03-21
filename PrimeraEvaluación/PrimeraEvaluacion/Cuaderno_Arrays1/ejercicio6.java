package Cuaderno_Arrays1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 6
Crea un array de 10 elementos de tipo entero, introduce 10 valores por teclado y
almacénalos en los elementos del array. Después calcula y muestra por pantalla el valor
máximo y mínimo.

 */
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arrayentero=new int[10];
		int num=0,min=0,max=0;
		System.out.print("introduce un valor");
		num=sc.nextInt();
		min=num;
		max=num;
		arrayentero[0]=num;
		for(int i=1;i<arrayentero.length;i++) {
			System.out.print("introduce un valor");
			num=sc.nextInt();
			
			
			arrayentero[i]=num;
			if(min>num) {
				min=num;
				
			}
			if(max<num) {
				max=num;
			}
		}System.out.println("El array es:"+Arrays.toString(arrayentero)+" siendo el menor "+min+" y el mayor"+max);
		
		
		
	sc.close();}

}
