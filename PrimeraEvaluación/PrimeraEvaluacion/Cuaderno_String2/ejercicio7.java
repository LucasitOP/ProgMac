package Cuaderno_String2;
/*
 * 7. Convertir cualquier palabra con un número impar de caracteres y de más de
dos caracteres en minúsculas excepto el carácter justo del medio que será con
mayúsculas. Probarlo con “TERREMOTO”.
 */
public class ejercicio7 {

	public static void main(String[] args) {
		String frase="TERREMOTO";
		int j=1;
		int mitad=frase.length()/2;
		for (int i=0;i<frase.length();i++) {
			String caracter=frase.substring(i,j);
			if(i==mitad) {
				System.out.print(caracter.toUpperCase());
			}else {
				System.out.print(caracter.toLowerCase());}
			j++;
		}
	}

}
