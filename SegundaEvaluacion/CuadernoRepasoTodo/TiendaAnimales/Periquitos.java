package TiendaAnimales;

public class Periquitos extends Animal {
private ColorPlumaje color;
private double precioCompra;
private double precioVenta;

public Periquitos(String nombre, int edad,ColorPlumaje color, double precioCompra, double precioVenta) {
	super(nombre, 1);
	this.color=color;
	this.precioCompra=color.getPrecioCompra();
	this.precioVenta=color.getPrecioVenta();
}


}
