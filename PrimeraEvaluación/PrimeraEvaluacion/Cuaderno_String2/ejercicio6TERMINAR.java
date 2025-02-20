package Cuaderno_String2;
/*
 * 6. En cualquier frase sustituir las primeras tres letras ‘a’ por tres asteriscos.
Probarlo con la frase “Esta es la frase en la que vamos a probar”
 */
public class ejercicio6TERMINAR {

	public static void main(String[] args) {
        String frase = "Esta es la frase en la que vamos a probar";
        String resultado = "";  
        int contador = 0;  
        int i = 0;  

        
        while (i < frase.length()) {
            char letra = frase.charAt(i);

            if (letra == 'a' && contador < 3) {  
                resultado += "*";  
                contador++; 
            } else {
                resultado += letra;  
            }

            i++;  
        }
        System.out.println("Frase modificada: " + resultado);
    }
}
