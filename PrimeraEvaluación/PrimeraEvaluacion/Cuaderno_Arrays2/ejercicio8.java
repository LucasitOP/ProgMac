package Cuaderno_Arrays2;

import java.util.Arrays;

/*
 *  Dado el siguiente array de Strings [“Coche”, “Tren”, “Avión”, “Furgoneta”, “Moto”, “Barco”,
 “Autobús”] y este otro array de booleanos [false, true, true, false, true, true, false].
 */
public class ejercicio8 {

	public static void main(String[] args) {
		String []arraynormal={"Coche","Tren","Avión","Furgoneta","Moto","Barco","Autobús"};
		boolean[]arraybooleano= {false,true,true,false,true,true,false};
		//true a mayuscula y false a miniscula
		int contadorminuscula=0,contadormayuscula=0;
		for(int i=0;i<arraynormal.length;i++) {
			if(arraybooleano[i]==false) {
				arraynormal[i]=arraynormal[i].toLowerCase();
				contadorminuscula++;
			}else {
				arraynormal[i]=arraynormal[i].toUpperCase();
				contadormayuscula++;
			}
		}		//Creación de los arrays donde se almacenan
		String[]arraymayuscula=new String[contadormayuscula];
		String[]arrayminuscula=new String[contadorminuscula];
		//Machacamos variables para añadir
		contadorminuscula=0;
		contadormayuscula=0;
		for(int i=0;i<arraynormal.length;i++) {
			if(arraybooleano[i]==false) {
				arrayminuscula[contadorminuscula]=arraynormal[i];
				contadorminuscula++;
				
			}else {
				arraymayuscula[contadormayuscula]=arraynormal[i];
				contadormayuscula++;
			}
		}
		//mostramos por pantalla los dos arrays
		System.out.println("Array minusculas"+Arrays.toString(arrayminuscula));
		System.out.println("Array mayusculas"+Arrays.toString(arraymayuscula));
		
	}

}
