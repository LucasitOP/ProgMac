package CuadernoHerencia1;

import java.util.Scanner;

public class Manejadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trabajador tr1 = new Trabajador();
		Trabajador tr2 = new Trabajador("lucas", 55, 33, CategoriaProfesional.A, 5);

		tr1 = pedirDatosTrabajador(sc);
		System.out.println(tr1.toString());
		System.out.println(tr2.toString());
		sc.close();
	}

	public static Trabajador pedirDatosTrabajador(Scanner scanner) {
		System.out.println("Ingrese los datos del trabajador:");

		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("telefono: ");
		int telefono = scanner.nextInt();

		System.out.print("Edad: ");
		int edad = scanner.nextInt();
		scanner.nextLine();

		System.out.print("antiguedad: ");
		int antiguedad = scanner.nextInt();
		scanner.nextLine();

		CategoriaProfesional categoria = null;
		while (categoria == null) {
			System.out.print("Seleccione una categoría: ");
			for (CategoriaProfesional cat : CategoriaProfesional.values()) {
				System.out.println("- " + cat); // Muestra todas las opciones en una lista
			}
			String categoriaStr = scanner.nextLine().toUpperCase();

			try {
				categoria = CategoriaProfesional.valueOf(categoriaStr);
			} catch (IllegalArgumentException e) {
				System.out.println("Error: Categoría inválida");
			}
		}

		return new Trabajador(nombre, telefono, edad, categoria, antiguedad);
	}
}
