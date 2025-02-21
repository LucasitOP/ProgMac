package CuadernoPolimorfismo;

public class Software extends Articulos {
private String tipoArticulo;





public Software(String codigo, String nombre, double precio, int cantidad , String tipoArticulo) {
	super(codigo, nombre, precio, cantidad);
	this.tipoArticulo=tipoArticulo;
}
@Override
public String toString() {
	return "Es un Software :"+super.toString()+" tipoArticulo=" + tipoArticulo;
}

}
