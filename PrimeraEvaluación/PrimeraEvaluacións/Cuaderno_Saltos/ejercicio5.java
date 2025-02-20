package Cuaderno_Saltos;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contador1=0, num=0;
		
		while (num>=0) {
			System.out.println("Numero:");
			num=sc.nextInt();
			if (num<0) {
				break;
			}
			contador1+=num;
		}
		System.out.println("La suma es:"+contador1);
		
	sc.close();}

}
