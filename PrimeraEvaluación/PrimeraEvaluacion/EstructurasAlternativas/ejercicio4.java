package EstructurasAlternativas;
/*
 * TERMINAR
 */
import java.util.Scanner;

/*
 * Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las
dimensiones de los lados de un triángulo. El programa debe determinar qué
tipo de triangulo es, teniendo en cuenta los siguiente:
● Si se cumple Pitágoras entonces es triángulo rectángulo
● Si sólo dos lados del triángulo son iguales entonces es isósceles.
● Si los 3 lados son iguales entonces es equilátero.
● Si no se cumple ninguna de las condiciones anteriores, es escaleno.

Analisis

Diseño


 */
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=0,B=0,C=0;
		System.out.print("Dime los valors \n A:");
		A=sc.nextInt();
		System.out.print("B:");
		B=sc.nextInt();
		System.out.print("C:");
		C=sc.nextInt();
		
		if (Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)) {
		    System.out.println("Es un triángulo rectángulo.");
		
		}else if (A==B && B==C) {
			System.out.println("El triángulo es equilatero.");
		}	else if (A==B | A==C | B==C){
				System.out.println("El triángulo es isósceles.");
		}else 
			System.out.println("El triángulo es escaleno.");
		
	sc.close();}

}
