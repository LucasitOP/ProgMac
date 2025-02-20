package Secuenciales2;

import java.util.Scanner;

public class ejercicio7 {
//Un alumno desea saber cuál será su calificación final en una materia.
	//Dicha calificación se compone de los siguientes porcentajes:
		//- 55% del promedio de sus tres calificaciones parciales.
		//- 30% de la calificación del examen final.
		//- 15% de la calificación de un trabajo final.
		//El alumno introduce las calificaciones de los 4 exámenes y el trabajo.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double exam1par,exam2par,exam3par,ponderacionparcial,examfin,trabfin,calificacionfin;
		System.out.print("Dime la calificación del primer examen parcial:");
		exam1par=sc.nextDouble();
		System.out.print("Dime la calificación del segundo examen parcial:");
		exam2par=sc.nextDouble();
		System.out.print("Dime la calificación del tercer examen parcial:");
		exam3par=sc.nextDouble();
		ponderacionparcial=(exam1par+exam2par+exam3par)/3*0.55;
		System.out.println("Dime la calificación del examen final:");
		examfin=sc.nextDouble();
		examfin=examfin*0.30;
		System.out.print("Dime la calificación de tu trabajo final:");
		trabfin=sc.nextDouble();
		trabfin=trabfin*0.15;
		
		calificacionfin=ponderacionparcial+examfin+trabfin;
		System.out.println("Tu calificación final es:"+calificacionfin);
		
		
		
		
		sc.close();
	}

}
