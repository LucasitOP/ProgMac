package ArrayBidimensional1;
/*
 *  En unamatriz de enteros obtener cual es el elemento mayor. Probarlo con:
 {{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}}
 */
public class ejercicio3 {

	public static void main(String[] args) {
		int numeromax=0;
		int arraybidi[][]= {{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}};
		for (int i=0;i<arraybidi.length;i++) {
			for(int j=0;j<arraybidi[i].length;j++) {
				if(arraybidi[i][j]>numeromax) {
					numeromax=arraybidi[i][j];
				}
			}
		}
		System.out.println("El mayor es:"+numeromax);
	}

}
