package Cuaderno_Composición_De_Clases;


public class Figura {
private String codigo;
private double precio;
private Dimension dimen;
private Pokemon poke;

public Figura(double precio, Dimension dimen,Pokemon poke) {
	this.precio=precio;
	this.dimen=dimen;
	this.poke=poke;
	this.codigo=crearCodigo();
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public Dimension getDimension() {
	return dimen;
}
public void setDimension(Dimension objeto) {
	this.dimen = objeto;
}
public Pokemon getPoke() {
	return poke;
}
public void setPoke(Pokemon poke) {
	this.poke = poke;
}
@Override
public String toString() {
	return "Figura [codigo=" + codigo + ", precio=" + precio + ", dimension=" + dimen + ", poke=" + poke + "]";
}

public void subirPrecio(double subida) {
	this.precio=precio+subida;
	
}
private String crearCodigo() {
	return (this.poke.getNombre().substring(0, 3)+crearNumeroAleatorio());
	
}
private int crearNumeroAleatorio() {
	return (int)Math.random()*(999-100+1)+100;
}
}
