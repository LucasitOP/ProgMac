package Cuaderno_String2;
/*
 * 3. Obtener en qué posición está la cuarta ‘a’ en una frase. Si la frase tiene
menos de 4 aes tiene que indicarlo. “Probarlo con “Esta es una frase con
unas cuantas aes”

 */
public class ejercicio3 {

	public static void main(String[] args) {
		String frase = "Este es una frase con unas cuantas aes";
		int contador = 0;
		int j = 1;
		String letra = "a";
		String subfrase;
		int fraselongitud = frase.length();
		for (int i = 0; i <fraselongitud; i++) {
			subfrase=(frase.substring(i, j));
			if (letra.equalsIgnoreCase(subfrase)) {
				contador++;
			}
			j++;
			if(contador==4) {
			i=frase.length();	//break;
			} 
				
			}if (contador<4){
				System.out.println("La frase contiene menos de 4 aes");
			
		}else {
		System.out.println("La 4ª a esta en la posición:"+(j-2));
		}
	}
}