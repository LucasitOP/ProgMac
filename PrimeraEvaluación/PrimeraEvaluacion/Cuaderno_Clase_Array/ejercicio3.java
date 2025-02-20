package Cuaderno_Clase_Array;

import java.util.Arrays;

/*
 *  3. Crear un un array de tamaño 100 de números tipo double.
 Rellénalo con valores aleatorios entre 5 y 9 ( utiliza el método random de la clase
 Math)
 Ordena el array y muéstralo por pantalla
 */
public class ejercicio3 {

	public static void main(String[] args) {
		double[] numeros=new double[100];
		double num=0;
		int contador1=0,contador2=1;
		final int numminimo=5, nummaximo=9;
		do{for( contador1=0;contador1<numeros.length;contador1++){
			num=(double)(Math.random()*(nummaximo-numminimo+1)+numminimo);
			Arrays.fill(numeros, contador1,contador2,num);
			contador2++;
			}}while(contador1<numeros.length);
		Arrays.sort(numeros);	
		System.out.println(Arrays.toString(numeros));
	}

}
