package Ev2_LucasAdriánTimoc;
//Clase hija de embarcación con sus propiedades, constructor y toString propio
public class Veleros extends embarcacion {
private String tipoDeVela;

public Veleros(String numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,String tipoDeVela) {
	super(numDeRegistro, nombre, longitud, tipoDeCasco);
	this.tipoDeVela=tipoDeVela;
}

@Override
public String toString() {
	return "Velero:"+super.toString()+ "|Tipo de vela=" + tipoDeVela;
}



}
