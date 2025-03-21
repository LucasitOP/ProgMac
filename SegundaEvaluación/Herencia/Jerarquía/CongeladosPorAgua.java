package Jerarquía;

import java.util.Date;

public class CongeladosPorAgua extends Congelados {
//gramos de sal por litro de agua
	private double salinidad;

	public CongeladosPorAgua(Date fecDeCaducidad, int numLote, Date fecEnvasado, String paisOrigen,
			double temperaturaManteRecom,double salinidad) {
		super(fecDeCaducidad, numLote, fecEnvasado, paisOrigen, temperaturaManteRecom);
		this.salinidad=salinidad;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

	@Override
	public String toString() {
		return "CongeladosPorAgua [salinidad=" + salinidad + "]";
	}
	public  void descripcion(){
		System.out.println("Soy un producto Congelado por Agua");
		
	}
}
