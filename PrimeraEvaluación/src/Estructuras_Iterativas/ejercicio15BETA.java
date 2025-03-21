package Estructuras_Iterativas;

import java.util.Scanner;

public class ejercicio15BETA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		String cadena = "";
		System.out.println("Introduce la altuda de caracteres");
		n = sc.nextInt();

		/* Diseño:
		 * i=1 ; cadena=""
		 * j=0 ---> cadena=1 -->syso-->1
		 * j=1 ---> sale del bucle
		 * 
		 * -------------------------
		 * i=2; cadena=""
		 * j=0---> cadena=2
		 * j 
		 */
		
		
		for (int i = 1; i <= n; i++) {
			cadena = "";
			for (int j = 0; j < i; j++) {
				cadena += i;
			}
			System.out.println(cadena);
		}

		sc.close();
	}

}
