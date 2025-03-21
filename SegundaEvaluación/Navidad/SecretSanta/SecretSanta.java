package SecretSanta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecretSanta {

    // Método para introducir alumnos manualmente
    public static List<String> enterStudents() {
        Scanner scanner = new Scanner(System.in);
        List<String> Alumno = new ArrayList<>();

        System.out.println("Introduce el nombre de los alumnos (escribe 'fin' para terminar):");
        while (true) {
            String InsertarAlumno = scanner.nextLine();
            if (InsertarAlumno.equalsIgnoreCase("fin")) {
                break;
            }
            Alumno.add(InsertarAlumno);
        }

        return Alumno;
    }

    // Método para generar las parejas de amigo invisible
    public static List<String[]> generatePairs(List<String> students) {
        List<String> shuffledStudents = new ArrayList<>(students);
        Collections.shuffle(shuffledStudents);

        List<String[]> pairs = new ArrayList<>();
        for (int i = 0; i < shuffledStudents.size(); i++) {
            String giver = shuffledStudents.get(i);
            String receiver = shuffledStudents.get((i + 1) % shuffledStudents.size());
            pairs.add(new String[]{giver, receiver});
        }

        return pairs;
    }

    // Método para codificar texto (A1Z26)
    public static String Codificar(String text) {
        StringBuilder Codificar = new StringBuilder();
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int value = c - 'a' + 1;
                Codificar.append(value).append("-");
            } else {
                Codificar.append(c);
            }
        }

        if (Codificar.length() > 0 && Codificar.charAt(Codificar.length() - 1) == '-') {
            Codificar.deleteCharAt(Codificar.length() - 1);
        }

        return Codificar.toString();
    }

    // Método para decodificar texto (A1Z26)
    public static String Decodificar(String text) {
        StringBuilder Decodificar = new StringBuilder();
        String[] tokens = text.split("[^0-9]+");

        for (String token : tokens) {
            if (!token.isEmpty()) {
                try {
                    int value = Integer.parseInt(token);
                    if (value >= 1 && value <= 26) {
                        Decodificar.append((char) ('a' + value - 1));
                    }
                } catch (NumberFormatException e) {
                }
            }
        }

        return Decodificar.toString();
    }

    // Método para mostrar las parejas con texto codificado y descodificado
    public static void displayPairs(List<String[]> pairs) {
        System.out.println("\nAmigo Invisible:");
        for (String[] pair : pairs) {
            String giver = pair[0];
            String receiver = pair[1];
            String encoded = Codificar(receiver);
            String decoded = Decodificar(encoded);

            System.out.printf("%s -> Codificado: %s -> Decodificado: %s%n", giver, encoded, decoded);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        List<String[]> pairs = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Introducir alumnos");
            System.out.println("2. Generar parejas");
            System.out.println("3. Mostrar parejas con codificación y decodificación");
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
                        pairs = generatePairs(students);
                        System.out.println("Parejas generadas.");
                    }
                    break;
                case 3:
                    if (pairs.isEmpty()) {
                        System.out.println("Primero genera las parejas.");
                    } else {
                        displayPairs(pairs);
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