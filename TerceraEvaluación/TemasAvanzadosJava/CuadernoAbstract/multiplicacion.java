package CuadernoAbstract;

public class multiplicacion extends Operacion {

	multiplicacion(double valor1, double valor2) {
		super(valor1, valor2);
	}

	@Override
	public double operar() {
		double multiplicacion=getValor1()*getValor2();
		return multiplicacion;
	}

}
