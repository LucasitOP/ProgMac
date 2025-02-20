package prueba1;

import java.util.Scanner;

public class prueba3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre="", apellido1="", apellido2="";
		System.out.println("dime el nombre");
		nombre=sc.next();
		System.out.println("dime el primer apellido");
		apellido1=sc.next();
		System.out.println("dime el segundo apellido");
		apellido2=sc.next();
		System.out.println("tu nombre es:"+nombre+"tu primer apellido es: "+apellido1+"tu segundo apellido es:"+apellido2);

		sc.close();
		
	}

}
