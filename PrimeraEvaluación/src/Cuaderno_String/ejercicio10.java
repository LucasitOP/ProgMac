package Cuaderno_String;

import java.util.Scanner;

/*
 * 10. Capturamos una frase por teclado y queremos que todas las vocales aparezcan en
mayúsculas.
 */
public class ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase="";
		System.out.println("Dime una frase");
		frase=sc.nextLine(); 	
		String nuevafrase=frase.replace("a", "A");
		nuevafrase=nuevafrase.replace("e", "E");
		nuevafrase=nuevafrase.replace("i", "I");
		nuevafrase=nuevafrase.replace("o", "O");
		nuevafrase=nuevafrase.replace("u", "U");
		System.out.println(nuevafrase);
		sc.close();
	}
}
