package CuadernoPolimorfismo;

public class Articulos {
private String codigo;
private String nombre;
private double precio;
private int cantidad;
public Articulos(){
	
}
public Articulos(String codigo,String nombre, double precio,int cantidad) {
	this.codigo=codigo;
	this.nombre=nombre;
	this.precio=precio;
	this.cantidad=cantidad;
}
@Override
public String toString() {
	return "Articulo :codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad;
}


}
