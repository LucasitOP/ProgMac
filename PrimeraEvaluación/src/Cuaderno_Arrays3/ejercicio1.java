package Cuaderno_Arrays3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Pide al usuario por teclado una frase, pasa sus caracteres a un array y muéstralo
por pantalla
 */
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce la frase:");
		String frase=sc.nextLine();
		char[]array=new char[frase.length()];
	for (int i=0;i<frase.length();i++)	{
			array[i]=frase.charAt(i);
			
	}
	System.out.println(Arrays.toString(array));
		
		
		
	sc.close();}

}
