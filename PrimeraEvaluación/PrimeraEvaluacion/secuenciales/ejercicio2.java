package secuenciales;
import java.util.Scanner;

public class ejercicio2 {
	//Modifica el programa anterior de manera que ahora solicite al usuario el nombre y su edad y luego
	//le salude mostrando el nombre y la edad capturados.
	public static void main(String[] args) {
		
		String nombre;
		int edad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		nombre=sc.next();
		System.out.println("Introduce tu edad");
		edad=sc.nextInt();
		System.out.println("Tu nombre es: "+nombre+" y tu edad es: "+edad);
		
		
		sc.close();

	}

}
