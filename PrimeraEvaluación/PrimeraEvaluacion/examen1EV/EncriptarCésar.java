package examen1EV;

import java.util.Scanner;

public class EncriptarCésar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[]caracterespañol= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','P','Q','R','S','T','U','V','W','X','Y','Z' };

		System.out.println("Introduce el texto que vas a encriptar:");
		String textoaencriptar=sc.nextLine();

		System.out.println("Introduce el desplazamiento");
		int desplazamiento=sc.nextInt();
		/*
		 * lo realizaremos con el ASCII, primero lo pasaremos todo a mayúsculas ya que la salida va a ser en
		 * mayúsculas. 
		 */
		char movimientodeletras=0;
		//Crearemos un array para almacenar los caracteres e ir transformandolos a nuestro gusto
		 char[]caracteres=new char[textoaencriptar.length()];
		 //Iniciamos con un bucle for para diferenciar los espacios y a continuación
		 //Realizar la indexación del caracter en el array
		 for(int i =0;i<textoaencriptar.length();i++) {
			 if(Character.isWhitespace(textoaencriptar.charAt(i))) {
				caracteres[i]=textoaencriptar.charAt(i); 
			 }else {
				 //Crearemos otro bucle donde le daremos la mayuscula, recordando que tiene que ser
				 // asi su salida y vamos agregando al array la frase a encriptar
				for(int j=0;j<=desplazamiento;j++) {
				
				 caracteres[i]=(char)textoaencriptar.toUpperCase().charAt(i);	
				 movimientodeletras=(char) (((char)caracteres[i])+j);
				 //Añado un if para que al pasarse la Z vuelva a la A
				 if(movimientodeletras>=91) {
					 movimientodeletras=caracterespañol[0];
				 }else {
					 caracteres[i]=caracterespañol[movimientodeletras-65];
				 }
				
				}
			 }
			 
			 
			 
		 }
		 String textoconvertido="";
		 //Creamos una manera para imprimir el array en una frase y lo sacamos por pantalla
		for(int q=0;q<caracteres.length;q++) {
			textoconvertido=textoconvertido+caracteres[q];
		}
		//Al realizarlo en ASCII tendremos que obviar la ñ 
		System.out.print("El mensaje cifrado en clave "+desplazamiento+" es:"+textoconvertido);
		

	sc.close();}

}
