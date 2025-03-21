package Cuaderno_Composición_De_Clases;

public class Dimension {
	private double alto,ancho,largo;
	
	public Dimension(int alto, int ancho, int largo) {
		this.alto=alto;
		this.ancho=ancho;
		this.largo=largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
	public double CalcularVolumen() {
		return alto*ancho*largo;
	}

	@Override
	public String toString() {
		return "Dimension [alto=" + alto + ", ancho=" + ancho + ", largo=" + largo +", volumen="+CalcularVolumen()+ "]";
	}
	
}
