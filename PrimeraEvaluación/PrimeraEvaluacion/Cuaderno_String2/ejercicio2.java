package Cuaderno_String2;
/*
 * 2. En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’.
Probarlo con “Esta es la frase donde vamos a poner almohadillas”
 */
public class ejercicio2 {

	public static void main(String[] args) {
		String frase="Esta es la frase donde vamos a poner almohadillas";
		//String nuevafrase="";
		int longitud=frase.length();
		for (int i=0;i<longitud;i++) {
			frase.charAt(i);
			if (i/3!=0) {				//nuevafrase=frase.replace(frase.substring(i,i), "*");	

			}else {
				frase=frase.replace(frase.substring(i,i+1), "#");	
			}

		}System.out.println(frase);
	}

}
