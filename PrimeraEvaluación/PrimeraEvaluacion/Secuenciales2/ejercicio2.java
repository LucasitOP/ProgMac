package Secuenciales2;
import java.util.Scanner;
public class ejercicio2 {
	//Realiza un programa que calcule el salario de un trabajador. El sistema solicita y el
	//usuario introduce las horas trabajadas y el valor por hora (€)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double horastrabajadas,valorhora,salario;
	System.out.println("Voy a calcular tu salario según los datos que te voy a pedir:\n -horas trabajadas en todos el mes\n -valor por hora \n Escribe tus horas trabajadas:");
	horastrabajadas=sc.nextDouble();
	System.out.println("Escribe el valor de la hora en euros:");
	valorhora=sc.nextDouble();
	salario=horastrabajadas*valorhora;
	System.out.println("Tu salario es: "+salario+"€");
	
	
	
	
	sc.close();}

}
