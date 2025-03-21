package CuadernoAbstract;

public class resta extends Operacion {

	resta(double valor1, double valor2) {
		super(valor1, valor2);
	}

	@Override
	public double operar() {
		double resta=getValor1()-getValor2();
			return resta;
	}

}
