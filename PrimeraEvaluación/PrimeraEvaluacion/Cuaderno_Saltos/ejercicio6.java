package Cuaderno_Saltos;

import java.util.Scanner;

/*
 * Solicitar al usuario números indefinidamente sumándolos hasta que el usuario introduzca
un valor negativo entonces mostrar el valor de la suma
 */
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contador1=0, num=0;
		
		do {
			System.out.println("Numero:");
			num=sc.nextInt();
			if (num<0) {
				break;
			}
			contador1+=num;
		}while (num>=0);
		System.out.println("La suma es:"+contador1);
		
	sc.close();}

}
