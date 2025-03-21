package prueba1;

import java.util.Scanner;
/*Haz un programa que realice la petición de dos numeros y realice su suma
 * 
 */
public class prueba2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	double a=0,b=0;
	System.out.print("Dime dos numeros para realizar su suma\n primer numero");
	a=sc.nextInt();
	System.out.println("Dime el segundo numero");
	b=sc.nextInt();
	int suma=(int) (a+b);
	System.out.print("La suma es:"+suma);
	int resta=(int) (a-b);
	System.out.println("la resta es: "+resta);
	int multiplicacion=(int) (a*b);
	System.out.println("la multiplicacion es:"+multiplicacion);
	double division=a/b;
	System.out.println("la division es: "+division);
	
	sc.close();}
}
