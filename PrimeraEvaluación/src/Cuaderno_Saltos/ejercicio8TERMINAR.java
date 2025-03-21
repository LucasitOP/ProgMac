package Cuaderno_Saltos;

import java.util.Scanner;

/*
 * Solicita un nº por teclado M , mostrar los los M primeros números impares
 */
public class ejercicio8TERMINAR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=0 ,impar=0;
		System.out.println("Dime un número");
		i=sc.nextInt();
		do {
			impar++;
			if(impar%2!=0) {
				
			i++;
			continue;
			
		} 
			System.out.println(impar);
		}while (impar==i);
	sc.close();

}
}
