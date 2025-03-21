package Ev2_LucasAdriánTimoc;
/*
 * Clase Madre la cuál tendremos las propiedades específicas nombradas en el enunciado.
 */
public class embarcacion {
private String numDeRegistro;
private String nombre;
private int longitud;
private TipoDeCasco tipoDeCasco;
public embarcacion(String numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco) {
	super();
	this.numDeRegistro = numDeRegistro;
	this.nombre = nombre;
	this.longitud = longitud;
	this.tipoDeCasco = tipoDeCasco;
}
@Override
public String toString() {
	return nombre +" Registro=" + numDeRegistro + "| longitud=" + longitud+ "| Tipo de casco=" + tipoDeCasco;
}
public String getNumDeRegistro() {
	return numDeRegistro;
}
public TipoDeCasco getTipoDeCasco() {
	return tipoDeCasco;
}


}
