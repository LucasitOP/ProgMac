package ArrayBidimensional2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Diseñar programa Java, que:
a) Crea una tabla bidimensional de longitud 3x3 y nombre matriz.
b) Carga la tabla con valores numéricos enteros introducidos por teclado
c) Obtiene la matriz traspuesta (filas X columnas) guardando valores en nueva matriz
llamada matrizT
d) Muestra ambas matrices por pantalla
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matriz[][]=new int[3][3];
		boolean inicializar=true;
		while (inicializar) {
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.println("Para la posición de la matriz ["+i+"]["+j+"] Introduce un número entero");
					matriz[i][j]=sc.nextInt();
				if(i==(matriz.length-1)&&j==(matriz.length-1)) {
					inicializar=false;
					}
				}
			}
		}
		int matrizT[][]=new int[3][3];
		boolean traspasar=true;
		while(traspasar) {
			for(int i=0;i<matrizT.length;i++) {
				for(int j=0;j<matrizT[i].length;j++) {
					matrizT[i][j]=matriz[j][i];
					if(i==(matrizT.length-1)&&j==(matrizT.length-1)) {
						traspasar=false;
					}
				}
			}
		}
		System.out.println("Matriz Normal:"+Arrays.deepToString(matriz));
		System.out.println("Matriz Traspuesta:"+Arrays.deepToString(matrizT));

	sc.close();}

}
