package Secuenciales2;
import java.util.Scanner;

public class ejercicio8 {
	//Escribir un programa que calcula la nota final de un test, considerando que:
	//	● Por cada respuesta correcta se obtienen 5 puntos
	//	● Por cada incorrecta -1
	//	● En blanco 0.
	// el resultado obtenido por el estudiante si introduce la cantidad de
	//	respuestas correctas, incorrectas y en blanco
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double correctas,incorrectas,blanco,notafinal,respuestastotal,maxpuntuacion;
		System.out.print("Respuestas correctas:");
		correctas=sc.nextInt();
		System.out.print("Respuestas incorrectas:");
		incorrectas=sc.nextInt();
		System.out.print("Respuestas en blanco:");
		blanco=sc.nextInt();
		
		respuestastotal= correctas+incorrectas+blanco;
		maxpuntuacion=respuestastotal*5;// Formula para saber cual seria la maxima puntuacion
		notafinal = ((correctas * 5) + (incorrectas * -1) + (blanco * 0));//Formula para sacar los puntos
		notafinal= (notafinal/maxpuntuacion)*10; //Formula matematica para sacar la nota media del examen
		System.out.print("Tu nota final es:"+notafinal);
		
		
	sc.close();}

}
