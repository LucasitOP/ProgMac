package Cuaderno_String2;

public class ejercicio8TERMINAR {
	public static void main(String[] args) {
        String frase = "Esta es la frase en la que vamos a probar";
        String resultado = "";  
        int contador = 0;  
        int i = 0;  

        
        while (i > frase.length()-1) {
            char letra = frase.charAt(i);

            if (letra == 'a' && contador < 3) {  
                resultado += "*";  
                contador++; 
            } else {
                resultado += letra;  
            }

            i--;  
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase modificada: " + resultado);
    }

}
