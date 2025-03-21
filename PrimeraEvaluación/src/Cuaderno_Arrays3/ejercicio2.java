package Cuaderno_Arrays3;

import java.util.Arrays;

/*
 * Generar y almacenar en una tabla 100 números aleatorios entre 250 y 400 (pueden
repetirse). Mostrar el contenido y luego máximo, el mínimo y la media.

 */
public class ejercicio2 {

	public static void main(String[] args) {
		int []tabla=new int [100];
		int maximo=0,minimo=400,media=0;
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int) (Math.random()*151+250);
			int numero=tabla[i];
			if(maximo<numero) {
				maximo=numero;
			}
			if(minimo>numero) {
				minimo=numero;
			}
			media+=numero;
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("El máximo es:"+maximo);
		System.out.println("El minimo es:"+minimo);
		System.out.println("El media es:"+media/tabla.length);

	}

}
