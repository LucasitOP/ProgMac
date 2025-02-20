package ArrayBidimensional3;

/*
 * Se quiere conocer y mostrar por pantalla:
a) Número total de oficinas en el edificio.
b) Cuál es el consumo total del edificio y de cada una de las plantas
c) Donde se sitúa la oficina que más consume y la que menos
 */
public class ejercicio3 {

	public static void main(String[] args) {
		int edificio[][] = {
				{10,4,3,8,5}, // 1ª Planta
				{15, 23},
				{90},
				{9,34,15,1},
				{6,45,12,3},
				{1,34,1,4},
				{4,4,124},
				{9,14,10,4},
				{9,4,10,6},
				{9,34,10,4,7,4,2} // 10ª Planta
				};
		//a
		int numeroTotalDeOficinas=0;
		for (int i=0;i<edificio.length;i++) {
			for (int j=0;j<edificio[i].length;j++) {
				numeroTotalDeOficinas++;
			}
		}
		System.out.println("Numero total de oficinas:"+numeroTotalDeOficinas);
		//b 
		int consumoTotal=0;
		int []arrayConsumoPlanta=new int[edificio.length];
		for(int i=0;i<edificio.length;i++) {
			int consumoPlanta=0;
			for(int j=0;j<edificio[i].length;j++) {
				consumoPlanta+=edificio[i][j];
				consumoTotal+=edificio[i][j];
			}
			arrayConsumoPlanta[i]=consumoPlanta;
		}
		System.out.println("Consumo Total="+consumoTotal);
		System.out.println("Consumo por planta:");
		for(int i=0;i<edificio.length;i++) {
			System.out.println((i+1)+"- Planta: "+arrayConsumoPlanta[i]);
		}
		//c 
		int mayor=0;
		int posicionMayor=-1;
		int posicionMenor=-1;
		int menor=arrayConsumoPlanta[0];
		for(int i=0;i<arrayConsumoPlanta.length;i++) {
			if(mayor<arrayConsumoPlanta[i]) {
				mayor=arrayConsumoPlanta[i];
				posicionMayor=i+1;
			}
			if(menor>arrayConsumoPlanta[i]) {
				menor=arrayConsumoPlanta[i];
				posicionMenor=i+1;
			}
		}
		System.out.println("Planta con Mayor Consumo:"+posicionMayor);
		System.out.println("Planta con Menor Consumo:"+posicionMenor);
	}

}
