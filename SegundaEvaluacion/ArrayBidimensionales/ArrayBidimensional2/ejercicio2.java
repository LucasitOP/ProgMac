package ArrayBidimensional2;

import java.util.Arrays;

/*
 * Hacer un programa Java, que:
a) Crea una matriz de 10x10 (filas x columnas) y nombre tabla.
b) Carga la matriz de manera que las filas pares se rellenan con 1 y las filas impares
con 0.
c) Una vez inicializada la matriz muestra su contenido en pantalla.

 */
public class ejercicio2 {

	public static void main(String[] args) {
		int matriz[][]=new int[10][10];
		boolean inicializar=true;
		while(inicializar) {
			for(int i=0;i<10;i++) {
				for (int j=0;j<10;j++) {
					if(i%2==0) {
						matriz[i][j]=1;
					}else {
						matriz[i][j]=0;
					}
					if(i>=9 && j>=9) {
						inicializar=false;
						
					}
				}
				
			}

		}System.out.print(Arrays.deepToString(matriz));
				
	}

}
