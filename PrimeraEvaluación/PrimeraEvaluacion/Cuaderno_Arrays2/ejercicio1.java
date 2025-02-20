package Cuaderno_Arrays2;
/*
 * Dado el siguietne array de String ["tren","coche","barco","avioneta"];
 * obetenr otro de enteros y del mismo tamaño que en cada posición esté la longitud de cada String
 */
public class ejercicio1 {

	public static void main(String[] args) {
		String[]arraystring={"tren","coche","barco","avioneta"};
		int []arrayentero=new int[arraystring.length];
		for(int i=0;i<arraystring.length;i++) {
			int longitud=(arraystring[i]).length();
			arrayentero[i]=longitud;
			
		}
		

	}

}
