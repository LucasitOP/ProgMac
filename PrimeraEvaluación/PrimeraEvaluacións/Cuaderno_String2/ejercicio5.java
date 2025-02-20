package Cuaderno_String2;
/*
 * 5. Obtener el número de palabras que hay en cualquier frase. Probarlo con “A
ver cuántas palabras hay aquí.”

 */
public class ejercicio5 {

	public static void main(String[] args) {
		String frase="A ver cuántas palabras hay aquí";
		String espacio=" ";
		frase.trim();
		int contador=0, j=1;
		for (int i=0;i<frase.length();i++) {
			String car=frase.substring(i,j);
			if (espacio.equals(car)) {
				contador++;
				
			}j++;
		}//Intuimos que antes del espacio hay una palabra por utilizar el Trim() lo cuál sumamos 1 al contador.
		
		contador+=1;
		System.out.println("Hay "+contador+ " palabras en total");
	}

}
