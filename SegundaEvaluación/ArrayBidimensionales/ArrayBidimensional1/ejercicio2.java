package ArrayBidimensional1;
/*
 * Obtener y mostrar la longitud de la fila más larga de un array bidimensional.
 Probarlo con el siguiente array:
 {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}}
 */
public class ejercicio2 {

	public static void main(String[] args) {
		int array[][]= {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}};
		int max=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			if(j>max) {
				max=j;
			}	
			}
		}System.out.println((max+1));//Le sumo 1 ya que empieza a contar desde la posición 0

	}

}
