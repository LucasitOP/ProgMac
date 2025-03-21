package Estructuras_Iterativas;

import java.util.Scanner;

/*
 * Crear un programa que solicite y vaya sumando los números introducidos por teclado
hasta que se introduzca el valor 0. Al finalizar debe mostrar el total de números
introducidos y la suma.
 */
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,contador1=0,contador2=-1;
		int cerrar = 0;
		do {
		System.out.println("Introduce los numeros que quieras, para parar el programa utilice 0.");
		num=sc.nextInt();
		contador1+=num;
		contador2++;
		if (num==0) {
			cerrar=1;
		}
		}while (cerrar==0);
		System.out.println("La suma de los numeros es:"+contador1+"\n Se han relizado "+contador2+" sumas");
		
		
		
		
	sc.close();}

}
