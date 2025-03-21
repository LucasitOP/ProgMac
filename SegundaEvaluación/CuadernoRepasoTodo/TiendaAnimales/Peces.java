package TiendaAnimales;

public class Peces extends Animal {
private int Temperatura;
private double precioCompra;
private double precioVenta;
public Peces (String nombre,int edad,int Temperatura,double precioCompra,double precioVenta) {
	super(nombre,2);
	this.Temperatura=Temperatura;
	this.precioCompra=1.25;
	this.precioVenta=9.75;
}
public double getPrecioCompra() {
	return precioCompra;
}
public void setPrecioCompra(double precioCompra) {
	this.precioCompra = precioCompra;
}
public double getPrecioVenta() {
	return precioVenta;
}
public void setPrecioVenta(double precioVenta) {
	this.precioVenta = precioVenta;
}

}
