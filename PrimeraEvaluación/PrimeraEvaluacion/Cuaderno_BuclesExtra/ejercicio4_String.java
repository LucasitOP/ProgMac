package Cuaderno_BuclesExtra;
/*
 * Desarrolla un programa que solicite un número N por teclado y muestre el factorial de todos
los números desde 1 hasta N. Por ejemplo, si N=4 se mostrará:
 */

import java.util.Scanner;

public class ejercicio4_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=0;
		System.out.println("Dime un número entero:");
		num=sc.nextInt();
		int multiplicador=1;	
		System.out.print(num+"!=");
		for (int i=1;i<=num;i++) {
			
			multiplicador*=i;
			System.out.print(i);
			if(i<num) {
			System.out.print("*");
			}}
		System.out.println("="+multiplicador);
		
		
		
	sc.close();}

}
