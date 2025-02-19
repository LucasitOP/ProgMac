package Jerarquía;

import java.util.Date;

public class Productos {
private Date fecDeCaducidad;
private int numLote;
public Productos(Date fecDeCaducidad, int numLote) {
	super();
	this.fecDeCaducidad = fecDeCaducidad;
	this.numLote = numLote;
}
public Date getFecDeCaducidad() {
	return fecDeCaducidad;
}
public void setFecDeCaducidad(Date fecDeCaducidad) {
	this.fecDeCaducidad = fecDeCaducidad;
}
public int getNumLote() {
	return numLote;
}
public void setNumLote(int numLote) {
	this.numLote = numLote;
}
@Override
public String toString() {
	return "Productos [fecDeCaducidad=" + fecDeCaducidad + ", numLote=" + numLote + "]";
}

}
