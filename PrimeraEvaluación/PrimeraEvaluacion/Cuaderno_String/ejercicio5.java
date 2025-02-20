package Cuaderno_String;
/*
 * 5.- Coger cualquier frase y hacer un programa que muestre línea por línea cada letra
de la frase exceptuando los espacios. Probarlo con “Esta es la frase del ejercicio 5”.
O sea, el resultado debe de mostrar:
 */
public class ejercicio5 {

	public static void main(String[] args) {
		String frase="Esta es la frase del ejercicio 5";
		String frasesinespacio=frase.replace(" ",""); 
		//int j=1;
		for (int i=0;i<frasesinespacio.length();i++) {
			//System.out.println(frasesinespacio.substring(i,j));
			//j++;
			System.out.println(frasesinespacio.charAt(i));		}
	}

}
