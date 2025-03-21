package CuadernoAbstract;

public class suma extends Operacion {

	suma(double valor1, double valor2) {
		super(valor1, valor2);
	}

	@Override
	public double operar() {
		double suma=getValor1()+getValor2();
		return suma;
	}

}
