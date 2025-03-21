package Ev2_LucasAdriánTimoc;
//clase hija con sus propiedades, constructor y toString propio
public class Pesqueros extends embarcacion {
	private String tipoDePesca;

	public Pesqueros(String numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,String tipoDePesca) {
		super(numDeRegistro, nombre, longitud, tipoDeCasco);
		this.tipoDePesca=tipoDePesca;
	}

	@Override
	public String toString() {
		return "Pesquero:"+super.toString()+ "|Tipo de pesca=" + tipoDePesca;
	}


}
