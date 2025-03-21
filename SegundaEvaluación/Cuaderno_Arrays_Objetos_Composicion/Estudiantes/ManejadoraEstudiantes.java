package Estudiantes;
import java.util.Scanner;
public class ManejadoraEstudiantes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el número de alumnos:");
	int alumnos=sc.nextInt();
	sc.nextLine();
	Estudiantes[] arrayEstudiantes=new Estudiantes[alumnos];
	for(int i=0;i<arrayEstudiantes.length;i++) {
		System.out.println("Introduce los datos del estudiante");
		arrayEstudiantes[i]=RecogerDatos(sc);
		
	}
	for(int j=0;j<arrayEstudiantes.length;j++) {
 System.out.println(arrayEstudiantes[j].toString());
	}
	sc.close();
	}
	public static Estudiantes RecogerDatos(Scanner sc) {
		System.out.println("Nombre:");
		String nombre=sc.next();
		System.out.println("Edad:");
		int edad=sc.nextInt();
		System.out.println("Calificaciones:");
		//suponemos que son 3 notas. El enunciado no describe cuantas notas hay.
		System.out.println("1ªEvaluación");
		int eva1= sc.nextInt();
		System.out.println("2ªEvaluación");
		int eva2=sc.nextInt();
		System.out.println("3ªEvaluación");
		int eva3=sc.nextInt();
		int calificaciones[]=new int[3];
		calificaciones[0]=eva1;
		calificaciones[1]=eva2;
		calificaciones[2]=eva3;
		
		return new Estudiantes(nombre,edad,calificaciones);
	}
	
	

}
