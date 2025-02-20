package EstructurasAlternativas;

import java.util.Scanner;

/*
 * El director de una escuela está organizando un viaje de estudios, y requiere
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
compañía de viajes por el servicio.
La forma de cobrar es la siguiente:
● si son 100 alumnos o más, el costo del viaje por cada alumno es de 65
euros;
● de 50 a 99 alumnos, el costo es de 70 euros,
● de 30 a 49, de 95 euros,
● y si son menos de 30, 105 euros.
● Además, el costo de un autobús es de 4000 euros, sin importar el
número de alumnos. La capacidad de un autobús es de 60 plazas (El
importe del autobús/es lo paga el AMPA por lo que no se reparte entre
los alumnos aunque debe pagarse a la agencia)

Analisis

Diseño
 */
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos = 0, eurosalum = 0, eurosbus = 0, numerobuses = 0;
		final int plazas = 60;
		System.out.print("¿Cuántos alumnos se van al viaje?");
		alumnos = sc.nextInt();
		// Calculo de cuantos alumnos y los euros de los alumnos
		if (alumnos >= 100) {
			eurosalum = 65 * alumnos;
		} else if (alumnos >= 50 && alumnos <= 99) {
			eurosalum = 70 * alumnos;
		} else if (alumnos >= 30 && alumnos <= 49) {
			eurosalum = 95 * alumnos;
		} else
			eurosalum = 105 * alumnos;

		System.out.println("El coste de los alumnos en total es:" + eurosalum + " euros" + " y de cada alumno es:"
				+ (eurosalum / alumnos) + " euros.");
		// Calculo de las plazas del bus
		numerobuses = alumnos / plazas;
		if (alumnos % plazas != 0) {
			numerobuses ++; // Preguntar por que el ++ no funciona
			eurosbus = 4000 * numerobuses;

		} else
			eurosbus = 4000 * numerobuses;

		System.out.println("El coste del autobus es:" + eurosbus + " euros");
		System.out.println("Por lo que el total es:" + (eurosbus + eurosalum) + " euros");
		sc.close();
	}

}
