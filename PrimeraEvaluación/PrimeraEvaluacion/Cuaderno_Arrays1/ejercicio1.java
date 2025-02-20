package Cuaderno_Arrays1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 1
Dado estos dos arrays: {1, 3, 5, 7, 8} y {1, 2, 3, 4, 5} obtener y mostrar un array llamado
resultado que sea la suma de ambos (suma de elementos de la misma posición).
 */
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] myarray1={1, 3, 5, 7, 8}, myarray2={1, 2, 3, 4, 5};
		int [] arraysuma = new int[myarray1.length];
		for(int i=0;i<myarray1.length;i++) {
			arraysuma[i]=myarray1[i]+myarray2[i];
		}
		System.out.print(Arrays.toString(arraysuma));
		
		
	sc.close();}

}
