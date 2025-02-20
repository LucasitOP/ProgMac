package Apoyoexamen;
import java.util.Scanner;

/*
 * Desarrolla otro programa que capture un valor entero positivo M y calcule y muestre
por pantalla los M primeros números primos.
 */
public class sacar_m_numerosprimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		// Realizamos un do while para recoger un número mayor que 0
		do {
			System.out.print("Introduce un número entero positivo: ");
			m = sc.nextInt();
			
		} while (m < 0);
		/*
		 * Declaramos e inicializamos el contador para recoger los numeros que son primos,
		 * mas abajo se puede visualizar que si el divisor de los numeros es ==2 se va incrementando
		 * por lo que utilizamos un while para que llegue hasta el número introducido por pantalla 
		 * siendo esta la variable m.
		 * inicializamos 2 como primer numero primo. 
		 */
		int contador = 0, num = 2;

		System.out.println("Los primeros " + m + " numeros primos son:");
		while (contador < m) {
			/*Realizamos el while para que se repita hasta que los numeros sacados por pantalla sean
			 * los mismo que el usuario a introducido.
			*/
			int divisores = 0;
			/* declaramos divisores y utilizamos un for a continuación para recoger por cuantos numeros se puede
			 * dividir los numeros de nuestra variable num inializada como 2, esta variable se ira incrementado
			 * a final del bucle while para recibir los m numeros que ingrese por pantalla .
			 */
			for (int i = 1; i <= num; i++) {
				
					if (num % i == 0) {
						divisores++;
					}
				
			}
			/*
			 * Salida por pantalla del numero agregando un espacio y sumando al final contador para
			 * evitar que se ocurra un bucle infinito.
			 */
			if (divisores == 2) {
				System.out.print(num + " ");
				contador++;
			}
			//Incrementación de la variable número
			num++;
		}
		sc.close();
	}

}
