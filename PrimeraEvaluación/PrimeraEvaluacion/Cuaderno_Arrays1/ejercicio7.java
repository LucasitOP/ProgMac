package Cuaderno_Arrays1;

import java.util.Scanner;

/*
 * Ejercicio 7
Modifica el ejercicio 5 para que al principio del programa nos pida cuántas posiciones
queremos que tenga el vector y sea este dato el que utilicemos para darle dimensión
 */
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cuantas posiciones quieres:");
		int num=sc.nextInt(); 
		int ejemploelementos[]=new int[num];
		for (int i=0;i<ejemploelementos.length;i++) {
			ejemploelementos[i]=i;
		
		
	sc.close();}

}
}

