package SecuencialesExtra;

import java.util.Scanner;

public class ejercicio3 {
	//Resuelve una ecuación de segundo grado a partir de sus coeficientes
	//(sin comprobar el signo interior de la raíz cuadrada)
	
	
	/*Analisis
	 * Tenemos que coger numeros por pantalla 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=0,b=0,c=0,discriminante=0,resultado1=0,resultado2=0;
        System.out.print("Ingrese a: ");
         a = sc.nextDouble();

        System.out.print("Ingrese b: ");
         b = sc.nextDouble();

        System.out.print("Ingrese c: ");
         c = sc.nextDouble();

         discriminante = Math.pow(b, 2) - 4 * a * c;

        
        if (a == 0) {
            System.out.println("El coeficiente a no puede ser 0 en una ecuación de segundo grado.");
        } else {

        	resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        	resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones de la ecuación son:");
            System.out.println("x1 = " + resultado1);
            System.out.println("x2 = " + resultado2);
        }
		
	sc.close();}

}
