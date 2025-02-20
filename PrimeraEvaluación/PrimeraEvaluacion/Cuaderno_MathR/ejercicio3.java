package Cuaderno_MathR;

import java.io.IOException;
import java.util.Scanner;

/*
 * Capturamos un número positivo por teclado y deseamos calcular su raíz
cuadrada, si es negativo el programa debe indicarlo y volver a solicitar el
número.
 */

public class ejercicio3 {
	public static void main(String[] args) throws IOException   {
		Scanner sc=new Scanner (System.in);
		int num=0;
		boolean continuar=true;
		while (continuar) {
			
			try { 
				System.out.println("Introduce un numero");
				num=sc.nextInt();
				if (num<0){
					throw new IllegalArgumentException("El número debe ser positivo");
					
				}
			}catch (IllegalArgumentException e){
				
			}
			System.out.println("La raíz cuadrada de :"+num+" es igual a:"+Math.sqrt(num));
			
			
			//Continuación y salida
			
			System.out.println("Si desea continuar pulse 1, si no pulse otro número");
			int salida=sc.nextInt();
			if(salida!=1) {
				continuar=false;
			}
			System.out.println("Hasta otra!!");
		}
		
		
		
sc.close();}
}