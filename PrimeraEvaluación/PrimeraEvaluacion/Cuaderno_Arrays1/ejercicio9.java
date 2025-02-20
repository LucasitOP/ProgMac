package Cuaderno_Arrays1;

import java.util.Scanner;

/*
 * Realizar un programa Java que inicialice un vector de tipo numérico de tipo flotante llamado
notas de 3 elementos cuyos valores serán solicitados e introducidos por teclado por el
usuario.
El programa calcula y muestra la media obtenida.
 */
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float[]notas=new float[3];
		System.out.println("Introduce los valores:");
		float media=0;
		for(int i=0;i<notas.length;i++) {
			notas[i]=sc.nextFloat();
			System.out.println("Añadido!");
		}
		//Calculo de la media
		for(float suma:notas)
		{
			media+=suma;
			
		}
		System.out.println("La media es:"+(media/notas.length));
		
		
		
	sc.close();}

}
