package CuadernoClaseAbstracta;

public class Resta extends Operacion {

	Resta(double valor1, double valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	public double Operar(double valor1,double valor2){
		return valor1-valor2;
		
	}

	@Override
	double Operar() {
		return getValor1()-getValor2();
	}
}
