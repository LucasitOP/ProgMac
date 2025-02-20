package secuenciales;
import java.util.Scanner;

public class ejercicio3 {
//Realiza un programa que lea cada uno de los tipos de datos (una palabra, una línea, entero, double,
	//float y booleano) utilizando la clase Scanner y luego los muestre .
	//Intenta introducir datos no esperados ¿qué ocurre?
	public static void main(String[] args) {
		
		String palabra;
		String linea;	
		int entero;
		double decimales;
		float centesimales;
		boolean datoboleano;
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Escribe una palabra");
		palabra=sc.next();
		//if (inputPalabra.length() > 0) {
      //   palabra = inputPalabra.charAt(0);
    //} else {
  //      palabra = ' '; // Valor por defecto si no se ingresa nada
//    }
		
        sc.nextLine(); // Consumir la línea pendiente

		System.out.println("Escribe una linea");
		linea=sc.nextLine();	
		System.out.println("Escribe un numero entero");
		entero=Integer.parseInt(sc.nextLine());

		System.out.println("Escribe un numero valor double");
		decimales=Double.parseDouble(sc.nextLine());

		System.out.println("Escribe un numero con valor float");
		centesimales=Float.parseFloat(sc.nextLine());

		System.out.println("Escribe un valor para boolean(true/false)");
		datoboleano=Boolean.parseBoolean(sc.nextLine());

		
		System.out.println("palabra ="+ palabra+" linea= "+ linea+ " int = "+ entero+" double= "+decimales+ " float= "+ centesimales+ " boolean = "+datoboleano);
		
		
		
		
sc.close();

	}

}
