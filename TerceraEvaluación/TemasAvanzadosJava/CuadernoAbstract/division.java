package CuadernoAbstract;

public class division extends Operacion {

	division(double valor1, double valor2) {
		super(valor1, valor2);
	}

	@Override
	public double operar() {
		if(getValor2()==0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}
		double division=getValor1()/getValor2();
		return division;
	}

}
