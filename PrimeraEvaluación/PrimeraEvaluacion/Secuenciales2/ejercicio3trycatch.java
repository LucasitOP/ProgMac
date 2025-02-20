package Secuenciales2;
import java.util.Scanner;
public class ejercicio3trycatch {
	//Un estudiante realiza cuatro exámenes que tienen la misma ponderación. Realizar el
	//programa correspondiente para obtener el promedio de las calificaciones
	//introducidas por el estudiante.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double exam1 = 0, exam2 = 0, exam3 = 0, exam4 = 0;
        double calificacion;
		System.out.println("Voy a realizar tu promedio segun tus calificaciones \n Voy a necesitar el valor de tus 4 calificaciones");

        // Función para obtener una calificación válida
        exam1 = getValidoGrado(sc, "Primer examen:");
        exam2 = getValidoGrado(sc, "Segundo examen:");
        exam3 = getValidoGrado(sc, "Tercer examen:");
        exam4 = getValidoGrado(sc, "Cuarto examen:");

        // Calcular el promedio
        calificacion = (exam1 + exam2 + exam3 + exam4) / 4;
        System.out.println("El promedio de tus calificaciones es: " + calificacion);
        sc.close();
    }

    // Método para obtener una calificación válida
    private static double getValidoGrado(Scanner sc, String prompt) {
        double grado = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(prompt);//prompt se queda con el último mensaje puesto
                grado = sc.nextDouble();
                if (grado < 1 || grado > 10) {
                    throw new Exception("La calificación debe estar entre 1 y 10.");
                }
                valid = true; // Si la calificación es válida, salir del bucle
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // Limpiar el buffer
            }
        }
        return grado;
    }

}