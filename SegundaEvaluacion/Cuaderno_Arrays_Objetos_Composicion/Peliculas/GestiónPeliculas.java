package Peliculas;

import java.util.Scanner;

public class GestiónPeliculas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pelicula[] peliculas=new Pelicula[5];
		/*for (int i=0;i<peliculas.length;i++) {
			peliculas[i]=PedirDatos(sc);
		}*/
		peliculas[0]=new Pelicula("TED",  "Pet", 2012, 124);
		peliculas[1]=new Pelicula("TED2", "Pet", 2022, 123);
		peliculas[2]=new Pelicula("TED3", "Pet", 2026, 90);
		peliculas[3]=new Pelicula("TED4", "Pet", 2015, 114);
		peliculas[4]=new Pelicula("TED5", "Peter", 2019, 130);		
		System.out.println("Introduce el autor que quieres buscar:");
		String autor=sc.nextLine();
			pintarPeliculas(autor,peliculas);
			
		System.out.println("Introduce los minutos para filtar las pelis");
		int duracionfiltar=sc.nextInt();
		filtarPeli(duracionfiltar, peliculas);
		
		
	sc.close();}
public static Pelicula PedirDatos(Scanner sc) {
	System.out.println("Introduce Titulo:");
	String titulo=sc.nextLine();
	System.out.println("Introduce autor:");
	String autor=sc.nextLine();
	System.out.println("Introduce anyo");
	int anyo=sc.nextInt();
	System.out.println("Introduce minutos");
	int min=sc.nextInt();
	return new Pelicula(titulo,autor,anyo,min);
}

public static void pintarPeliculas(String director,Pelicula[]peliculas) {
	for(int i=0;i<peliculas.length;i++) {
		if(peliculas[i]!=null && peliculas[i].getDirector().equals(director)) {
			System.out.println(peliculas[i].toString());
		}
	}
}
public static void filtarPeli(int minutos,Pelicula[]peliculas) {
	for(int i=0;i<peliculas.length;i++) {
		if(peliculas[i]!=null && peliculas[i].getDuracion()>minutos) {
			System.out.println(peliculas[i].toString());
		}
	}

}
}
