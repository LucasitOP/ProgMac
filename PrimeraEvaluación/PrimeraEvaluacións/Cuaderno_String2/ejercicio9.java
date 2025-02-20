package Cuaderno_String2;
/*
 * 9. En un String con cualquier número de letras ‘a’ convertir una en mayúsculas
y la siguiente dejarla como está, la siguiente en mayúsculas y la siguiente
dejarla… etc… Probarlo con “Esta es una frase con algunas letras a”
 */
public class ejercicio9 {

    public static void main(String[] args) {
        String frase = "Esta es una frase con algunas letras a";
        String resultado = ""; // Cadena para almacenar el resultado
        boolean convertirEnMayuscula = true; // Alternar entre mayúscula y minúscula

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter == 'a') {
                if (convertirEnMayuscula) {
                    resultado += 'A'; // Convertir a mayúscula
                } else {
                    resultado += 'a'; // Dejar en minúscula
                }
                convertirEnMayuscula = !convertirEnMayuscula; // Alternar el estado
            } else {
                resultado += caracter; // Mantener otros caracteres sin cambios
            }
        }

        // Mostrar el resultado
        System.out.println("Frase original: " + frase);
        System.out.println("Frase modificada: " + resultado);
    }
}
