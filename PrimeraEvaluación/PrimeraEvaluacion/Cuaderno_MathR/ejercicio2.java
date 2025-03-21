package Cuaderno_MathR;

import java.io.IOException;
import java.util.Scanner;

/*
 * 2. Capturamos un número por teclado y queremos saber el valor de e elevado a
ese número. ( e
número
)
Criterio: Introducción del valor 0
 */
public class ejercicio2 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		final double e=Math.E;
		double resultado=0;
		char salida='S';
		while (salida=='S') {
			System.out.println("Introduce un número");
			int num=sc.nextInt();
			
			resultado=Math.pow(e,num);
			System.out.println("La potencia de e elevado a "+num+" es:"+resultado);
			System.out.println("Deseas continuar? S/N");
			salida=(char) System.in.read();
			
			
			
			
		}
		System.out.println("Hasta pronto!");
		
	sc.close();}
	
}
