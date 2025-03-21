package Estructuras_Iterativas;

import java.util.Scanner;

/*
 * Crea un programa que solicite la altura de una escalera N por teclado y muestre una
escalera de asteriscos de este tipo:
 */
public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		String asterisco="*";
		System.out.println("Escribe un número");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
				System.out.println(asterisco);
				asterisco+="*";
		}

	sc.close();}

}
