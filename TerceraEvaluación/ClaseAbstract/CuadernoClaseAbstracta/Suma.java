package CuadernoClaseAbstracta;

public class Suma extends Operacion {

	Suma(double valor1, double valor2) {
		super(valor1, valor2);
	}

	

	@Override
	double Operar() {
		return getValor1()+getValor2();
	}
}
