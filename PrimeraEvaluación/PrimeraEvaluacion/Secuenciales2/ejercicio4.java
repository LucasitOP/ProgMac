package Secuenciales2;
import java.util.Scanner;
public class ejercicio4 {
	//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados
	//Celsius utilizando la fórmula C = (F-32)*5/9
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double fahrenheit;
		int celsius;
		System.out.println("Dime el valor en grados Fahrenheit:");
		fahrenheit=sc.nextDouble();
		celsius=(int) ((fahrenheit-32)*5/9);
		
		System.out.print("Aquí lo tienes en grados Celsius:"+celsius);





	sc.close();}

}
