package Secuenciales2;
import java.util.Scanner;
public class ejercicio3 {
	//Un estudiante realiza cuatro exámenes que tienen la misma ponderación. Realizar el
	//programa correspondiente para obtener el promedio de las calificaciones
	//introducidas por el estudiante.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double exam1,exam2,exam3,exam4,calificacion;
		System.out.println("Voy a realizar tu promedio segun tus calificaciones \n Voy a necesitar el valor de tus 4 calificaciones\n Primer examen:");
		exam1=sc.nextDouble();
		System.out.println("Segundo examen");
		exam2=sc.nextDouble();
		System.out.println("Tercer examen");
		exam3=sc.nextDouble();
		System.out.println("Cuarto examen");
		exam4=sc.nextDouble();
		calificacion=(exam1+exam2+exam3+exam4)/4;
		System.out.println("El promedio de tus calificaciones es:"+calificacion);
	sc.close();}

}
