package secuenciales;

public class ejercicio5 {
	//Copia el programa de la diapositiva (lee un carácter utilizando System.in.read() y
			//y muestra el caracter por pantalla)
			//Modifica la salida del programa para que ahora muestre su correspondiente valor numérico en
			//decimal, para ello modifica la línea
	
	//Comprueba qué ocurre si capturas los caracteres y muestras su valor numérico en decimal
	//utilizando la tabla ascii de la diapositiva
	
	
public static void main(String[]arg) throws java.io.IOException{
	
	char letra=0;
	System.out.println("Escribe una letra y pulsa ENTER");
	letra=(char) System.in.read();
	
	System.out.println("Has introducido"+(int)letra);}

}
