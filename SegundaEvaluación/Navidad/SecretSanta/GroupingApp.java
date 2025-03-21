package SecretSanta;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroupingApp {

    // Método para introducir alumnos manualmente
    public static List<String> enterStudents() {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        System.out.println("Introduce el nombre de los alumnos (escribe 'fin' para terminar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            students.add(input);
        }

        return students;
    }

    // Método para agrupar alumnos en grupos de 7
    public static List<List<String>> groupStudents(List<String> students) {
        List<List<String>> groups = new ArrayList<>();
        Collections.shuffle(students); // Barajar la lista de alumnos

        for (int i = 0; i < students.size(); i += 7) {
            int end = Math.min(i + 7, students.size());
            groups.add(new ArrayList<>(students.subList(i, end)));
        }

        return groups;
    }

    // Método para mostrar los grupos
    public static void displayGroups(List<List<String>> groups) {
        System.out.println("\nGrupos formados:");
        for (int i = 0; i < groups.size(); i++) {
            System.out.printf("Grupo %d: %s%n", i + 1, groups.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        List<List<String>> groups = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Introducir alumnos");
            System.out.println("2. Agrupar alumnos en grupos de 7");
            System.out.println("3. Mostrar grupos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    students = enterStudents();
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("Primero introduce los alumnos.");
                    } else {
                        groups = groupStudents(students);
                        System.out.println("Grupos generados.");
                    }
                    break;
                case 3:
                    if (groups.isEmpty()) {
                        System.out.println("Primero genera los grupos.");
                    } else {
                        displayGroups(groups);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

