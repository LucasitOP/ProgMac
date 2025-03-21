package CuadernoConstructoresEjercicio1;

	
public class Cafetera {
int capacidadMaxima,capacidadActual;

public Cafetera() {
this.capacidadMaxima=1000;
this.capacidadActual=0;
}
public Cafetera(int capacidadMaxima) {
	this.capacidadMaxima=capacidadMaxima;
	this.capacidadActual=capacidadMaxima;
}

public Cafetera(int capacidadMaxima, int capacidadActual) {
	this.capacidadMaxima = capacidadMaxima;

	if (capacidadActual>capacidadMaxima) {
		this.capacidadActual = capacidadMaxima;
	}
	else {
		this.capacidadActual = capacidadActual;
	}
	
}
public void llenarCafetera() {
	this.capacidadActual=this.capacidadMaxima;
}
public void sevirTaza(int capacidadaServir) {
	

if (capacidadaServir<=this.capacidadActual) {
	System.out.println("Se va a servir:"+capacidadaServir);
	this.capacidadActual=this.capacidadActual-capacidadaServir;
	System.out.println("Nos queda:"+this.capacidadActual);
}else {
	System.out.println("Se va a servir:"+capacidadActual+ " y nos hemos quedado sin café");
	this.capacidadActual=0;
}
	

}
public void VaciarCafetera() {
	this.capacidadActual=0;
}
public void agregarCafe(int AgregarCafe) {
	this.capacidadActual=this.capacidadActual+AgregarCafe;
}

}
