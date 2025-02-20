package Cuaderno_String2;
/*
 * 4. En cualquier frase cambiar la primera y la última palabra a mayúsculas.
Probarlo con la frase “Esta es la frase donde vamos a hacer los cambios”
 */
public class ejercicio4CORREGIR {

	public static void main(String[] args) {
		String frase="Esta es la frase donde vamos a hacer los cambios";
		for (int i=0;i<frase.length();i++)
		{
			if (i==0 || i==(frase.length()-1)){
				System.out.print(frase.toUpperCase().charAt(i));
				
			}else {
				System.out.print(frase.toLowerCase().charAt(i));
			}
		}
		
	}

}
