package ArrayBidimensional3;


	import java.util.Arrays;
	import java.util.Scanner;
	public class ejercicio2Beta {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce una frase:");
	        String frase = sc.nextLine().trim();

	        // PRIMER RECORRIDO: Contar el número de palabras (filas)
	        int filas = 1; // Mínimo hay una palabra
	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) == ' ' && frase.charAt(i - 1) != ' ') {
	                filas++;
	            }
	        }

	        //  SEGUNDO RECORRIDO: Contar caracteres de cada palabra (columnas)
	        int[] columnas = new int[filas];
	        int indiceFila = 0, longitud = 0;

	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) != ' ') {
	                longitud++;
	            } else if (i > 0 && frase.charAt(i - 1) != ' ') {
	                columnas[indiceFila] = longitud;
	                indiceFila++;
	                longitud = 0;
	            }
	        }
	        columnas[indiceFila] = longitud; // Guardar la última palabra

	        // Crear el array bidimensional con las filas y sus columnas definidas
	        char[][] arrayBidimensional = new char[filas][];
	        for (int i = 0; i < filas; i++) {
	            arrayBidimensional[i] = new char[columnas[i]];
	        }

	        // TERCER RECORRIDO: Rellenar el array con los caracteres
	        indiceFila = 0;
	        int indiceColumna = 0;

	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) != ' ') {
	                arrayBidimensional[indiceFila][indiceColumna] = frase.charAt(i);
	                indiceColumna++;
	            } else if (i > 0 && frase.charAt(i - 1) != ' ') {
	                indiceFila++;
	                indiceColumna = 0;
	            }
	        }

	        // Mostrar el resultado
	        System.out.println(Arrays.deepToString(arrayBidimensional));

	        sc.close();
	    }
	}


