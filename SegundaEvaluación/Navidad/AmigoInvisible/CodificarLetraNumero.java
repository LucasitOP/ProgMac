package AmigoInvisible;
import java.util.Scanner;

public class CodificarLetraNumero {

    public static String Codificar(String text) {
        StringBuilder codificar = new StringBuilder();
        text = text.toLowerCase(); 

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                int value = c - 'a' + 1;
                codificar.append(value).append("-"); 
            } else {
                codificar.append(c);
            }
        }

        if (codificar.length() > 0 && codificar.charAt(codificar.length() - 1) == '-') {
            codificar.deleteCharAt(codificar.length() - 1);
        }

        return codificar.toString();
    }

   
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salida=true;
        while(salida){
        System.out.println("A1Z26 Cipher - Codificar y Decodificar");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Codificar texto");
        System.out.println("2. Decodificar texto");
        System.out.println("3. Salida");
        int Elección = scanner.nextInt();
        scanner.nextLine(); 
        
        String input="";
        switch (Elección) {
        case 1: System.out.println("Ingrese el texto para codificar:");
         input = scanner.nextLine();
        String Codificar = Codificar(input);
        System.out.println("Texto codificado: " + Codificar);
        break;
        case 2:
        	System.out.println("Ingrese el texto para decodificar:");
             input = scanner.nextLine();
            String Decodificar = Decodificar(input);
            System.out.println("Texto decodificado: " + Decodificar);
         break;
        case 3:
        	salida=false;
        	break;
        	default:   System.out.println("Opción no válida.");

        		break;
        
        }
       
        
        
    }
        }
}
