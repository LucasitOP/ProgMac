package Cuaderno_Arrays1;

import java.util.Scanner;

/*
 * Crea un vector de tamaño 5, al que llamarás países. En él guardarás los nombres de 5
países que se introducirán por teclado. En un bucle posterior al de la inicialización del
vector, muestra su contenido.
 */
public class ejercicio8 {

	public static void main(String[] args) {
		String []paises=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce los países:");
		for(int i=0;i<paises.length;i++) {
			paises[i]=sc.nextLine();
			System.out.println("País Añadido!\n Siguiente País:");
		}
		System.out.print("Pintamos el array: {");
		for (int j=0;j<paises.length;j++) {
			System.out.print(paises[j]+",");
		}
		System.out.print("}");
	sc.close();}

}
