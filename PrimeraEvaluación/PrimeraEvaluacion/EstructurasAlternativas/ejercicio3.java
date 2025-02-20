package EstructurasAlternativas;

import java.util.Scanner;

/*Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’ y
muestre el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad
es mayor o igual a dieciocho y el género es ‘F’. En caso de que se cumpla
lo mismo, pero el sexo sea ‘M’,debe imprimir ‘ACEPTADO’. Si no se
cumplen dichas condiciones se debe mostrar ‘NO ACEPTADO/A’.

Analisis
 * Pediremos por pantalla tres datos los cuales dos son int y el restante es caracter
 * en función de unos valores presentados por el ejercicio tendremos que decir si está aceptado o no
 * 
 * Diseño
 * Ingresaremos el Scanner, declaramos e inicializamos los datos
 * leemos los datos por pantalla
 * empezamos a comparar datos con los valores minimos para que el usuario
 * reciba el mensaje Aceptado y sacamos por pantalla
 * En el caso del caracter añadimos un switch para limitar el caso en M y F
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nota=0,edad=0;
		char caracter;
		System.out.print("Dime la nota:");
		nota=sc.nextInt();
		System.out.print("Dime la edad:");
		edad=sc.nextInt();
		System.out.print("Dime el caracter:");
		caracter = sc.next().charAt(0);
		
		if (nota<5){
			System.out.println("NO ACEPTADO");
		}else if (edad<18) {
			System.out.println("NO ACEPTADO");

		}else 
			switch(caracter) {
			case 'M':
				System.out.println("ACEPTADO");
			break;
			case 'F': 
				System.out.println("ACEPTADª");
			break;
			default: System.out.println("NO ACEPTADO");
			break;
			}
		
		
		
	sc.close();}

}
