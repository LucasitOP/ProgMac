package RepasoArrays;

public class ejercicioUnidimensional {

	public static void main(String[] args) {
		double ta[]= {3,2,5,1};
		double tb[]= {93.23,3.5,8.24,4.5};
		double tc[]= {0.0,0.0,3.2,1.8};
		double [][]tba={{1,3,5,8},{0,4,-1,2},{1,10,1,1}};
		double [][]tbb={{1,4,4},{0,-11,5}};
		System.out.println(esMayor(tb,ta));
		System.out.println(esMayor(ta, tb));
		System.out.println(esMayor(tc, ta));
		operarTabla(ta);
		System.out.println();
		columnaSumaMayor(tba);
		System.out.println();
		columnaSumaMayor(tbb);
	}

	private static boolean esMayor(double[] tb, double[] ta) {
		double suma1=0,suma2=0;
		boolean salida=false;
		for (int i=0;i<tb.length;i++) {
			suma1+=tb[i];
		}
		for (int i=0;i<ta.length;i++) {
			suma2+=ta[i];
		}
		if(suma1>suma2) {
			salida=true;
		}
	return salida;
			
	}
	private static void operarTabla(double[] ta) {
		int contador=1;
		for (int i=0;i<=ta.length;i++) {
			contador++;
		}
		contador=contador/2;
		double[]nuevatabla=new double[contador];
		for (int j=0;j<nuevatabla.length;j+=2) {
			nuevatabla[j]=ta[j]+ta[j+1];
		}
		for(int i=0; i<nuevatabla.length; i++){
		    System.out.print("["+nuevatabla[i]+"]");
		}
	}
public static void columnaSumaMayor(double[][] tba ) {
	double mayorcolumna=0;
	double sumacadacolumna=0;
	int posiciondelcontador=0;
	int contador=-1;
	for (int i=0;i<tba[0].length;i++) {
		contador++;
		sumacadacolumna=0;
		for(int j=0;j<tba.length;j++) {
			sumacadacolumna+=tba[j][i];
			if(mayorcolumna<=sumacadacolumna) {
				mayorcolumna=sumacadacolumna;
				posiciondelcontador=contador;
			}
		}
	}
	System.out.println(posiciondelcontador);
}
}

