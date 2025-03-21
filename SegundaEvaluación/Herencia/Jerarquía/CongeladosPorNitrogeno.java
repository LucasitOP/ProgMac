package Jerarquía;

import java.util.Date;

public class CongeladosPorNitrogeno extends Congelados {

	private String metodoCongelacion;
	private int tiempoExpuesto;
	public CongeladosPorNitrogeno(Date fecDeCaducidad, int numLote, Date fecEnvasado, String paisOrigen,
			double temperaturaManteRecom,String metodoCongelacion,int tiempoExpuesto) {
		super(fecDeCaducidad, numLote, fecEnvasado, paisOrigen, temperaturaManteRecom);
		this.metodoCongelacion=metodoCongelacion;
		this.tiempoExpuesto=tiempoExpuesto;
		
	}
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}
	public int getTiempoExpuesto() {
		return tiempoExpuesto;
	}
	public void setTiempoExpuesto(int tiempoExpuesto) {
		this.tiempoExpuesto = tiempoExpuesto;
	}
	@Override
	public String toString() {
		return "CongeladosPorNitrogeno [metodoCongelacion=" + metodoCongelacion + ", tiempoExpuesto=" + tiempoExpuesto
				+ "]";
	}
	public void descripcion(){
		System.out.println("Soy un producto Congelado por Nitrogeno");
		
	}
	
}
