package Equipos_Deportivos;

public class Jugador {
private String nombre,posicion;
private int numero;
public Jugador(String nombre,String posicion,int numero) {
	this.nombre=nombre;
	this.posicion=posicion;
	this.numero=numero;
}
@Override
public String toString() {
	return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numero=" + numero + "]";
}
public int getNumero() {
	return numero;
}

}
