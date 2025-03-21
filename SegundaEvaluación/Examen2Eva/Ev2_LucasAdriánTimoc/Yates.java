package Ev2_LucasAdriánTimoc;
//clase hija con sus propiedades, constructor y toString propio
public class Yates extends embarcacion {
	private int camarotes;

	public Yates(String numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,int camarotes) {
		super(numDeRegistro, nombre, longitud, tipoDeCasco);
		this.camarotes=camarotes;
	}

	@Override
	public String toString() {
		return "Yate:"+super.toString()+ "|cantidad de camarotes=" + camarotes;
	}
}
