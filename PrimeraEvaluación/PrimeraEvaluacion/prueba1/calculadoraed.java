package prueba1;

import java.util.Scanner;

public class calculadoraed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Elige la operación que quieres realizar:1 Suma o 2 Resta");
		int opcion=sc.nextInt();
		System.out.println("Primer número:");
		double num1=sc.nextDouble();
		System.out.println("Segundo número:");
		double num2=sc.nextDouble();
		
		switch(opcion) {
		case 1:
			System.out.println("La suma es:"+sumar(num1,num2));
			break;
		case 2:
			System.out.println("La resta es:"+restar(num1,num2));
			break;
		default:
			System.out.println("No se ha podido realizar la operación");
			break;
		}
		
		
	sc.close();}
	public static double sumar(double a,double b) {
		return a+b;
	}
	public static double restar(double a,double b) {
		return a-b;
	}
}
