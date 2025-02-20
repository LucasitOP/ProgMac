package Cuaderno_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Crear un programa que lea por teclado un número entero (cualquiera) y que almacene el
 mismo en un array de modo que cada cifra ocupe un elemento del array.
 */
public class ejercicio9 {
public static void main(String[] arg ) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un número:");
	String numero=sc.nextLine();
	int contadorcifras=0;
	for(int i=0;i<numero.length();i++) {
		char caracter=numero.charAt(i);
		   if(Character.isDigit(caracter)) {
			   contadorcifras++;
			   
		   }
	}
	 //Creamos array 
	   int []arraynumeroseparados=new int[contadorcifras];
	   //ingresamos con otro bucle for
	   for(int i=0;i<contadorcifras;i++) {
		   char caracter=numero.charAt(i);
		   //Metodo getNumericValue necesario ya que lo estoy implementado de manera que me lo lee en ASCII, PD:Se podría hacer con String e utilizar
		   //un Integer.parseInt(String)
		   arraynumeroseparados[i]=	   Character.getNumericValue(caracter);
	   }
	//mostramos por pantalla
	   System.out.println(Arrays.toString(arraynumeroseparados));
	
	
sc.close();}
}