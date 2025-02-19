package Equipos_Deportivos;

public class Equipo {
private String nombre;
private Jugador[]jugadores=new Jugador[16];//Hemos creado el array de 16
public Equipo(){
	
}
public Equipo(String nombre,Jugador[]jugadores) {
	this.setNombre(nombre);
	this.setJugadores(jugadores);
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Jugador[] getJugadores() {
	return jugadores;
}
public void setJugadores(Jugador[] jugadores) {
	this.jugadores = jugadores;
}

}
