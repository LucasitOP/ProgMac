package Cuaderno_String;
/*
 * 7.- En cualquier frase obtener en qué posición aparece por primera vez un espacio.
Y después del primer espacio en que posición aparece el tercer espacio.
Probarlo con “Esta es una frase con varios espacios”

 */
public class ejercicio7REVISAR {

	public static void main(String[] args) {
		String frase="Esta es una frase con varios espacios";
		int pos=frase.indexOf(" ");
		System.out.println(pos);//primer espacio
		int contador=0;
		while (contador<2){
			pos=frase.indexOf(" ");
			contador++;
			
		}
		System.out.println(pos);
	}

}
