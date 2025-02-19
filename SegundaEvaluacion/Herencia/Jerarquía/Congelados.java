package Jerarquía;

import java.util.Date;

public class Congelados extends Productos {
	
	private Date fecEnvasado;
	private String paisOrigen;
	private double temperaturaManteRecom;
	
	public Congelados(Date fecDeCaducidad, int numLote,Date fecEnvasado, String paisOrigen, double temperaturaManteRecom) {
		super(fecDeCaducidad, numLote);
		this.fecEnvasado = fecEnvasado;
		this.paisOrigen = paisOrigen;
		this.temperaturaManteRecom = temperaturaManteRecom;	}

	public Date getFecEnvasado() {
		return fecEnvasado;
	}
	public void setFecEnvasado(Date fecEnvasado) {
		this.fecEnvasado = fecEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public double getTemperaturaManteRecom() {
		return temperaturaManteRecom;
	}
	public void setTemperaturaManteRecom(double temperaturaManteRecom) {
		this.temperaturaManteRecom = temperaturaManteRecom;
	}
	@Override
	public String toString() {
		return "Congelados [fecEnvasado=" + fecEnvasado + ", paisOrigen=" + paisOrigen + ", temperaturaManteRecom="
				+ temperaturaManteRecom + "]";
	}

	
}
