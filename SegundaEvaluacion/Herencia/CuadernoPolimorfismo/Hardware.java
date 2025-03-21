package CuadernoPolimorfismo;

public class Hardware extends Articulos {
private boolean esPeriferico;



public Hardware(String codigo, String nombre, double precio, int cantidad,boolean esPeriferico) {
	super(codigo, nombre, precio, cantidad);
	this.esPeriferico=esPeriferico;
	
}



@Override
public String toString() {
	return "Es un Hardware :"+super.toString()+ " Periferico=" + esPeriferico ;
}

}
