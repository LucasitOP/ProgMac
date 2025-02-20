package Secuenciales2;

import java.util.Scanner;

public class ejercicio9 {
	//Realiza un programa que reciba una cantidad de segundos y muestre por pantalla
	//cuántas horas y minutos son.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int seg,hor,min;
		System.out.print("Dime la cantidad de segundos:");
		seg=sc.nextInt();
		hor = seg / 3600;
	    min = (seg % 3600) / 60; //Se utiliza %3600 para sacar el resto y eso pasarlo a minutos.

	    System.out.println(seg + " segundos son " + hor + " horas y " + min + " minutos.");
		
		

	sc.close();}

}
