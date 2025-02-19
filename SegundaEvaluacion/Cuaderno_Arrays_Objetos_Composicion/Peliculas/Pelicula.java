package Peliculas;

public class Pelicula {
private String titulo,director;
private int anyo,duracion;

public Pelicula(String titulo,String director,int anyo,int duracion) {
	this.titulo=titulo;
	this.director=director;
	this.anyo=anyo;
	this.duracion=duracion;
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getAnyo() {
	return anyo;
}
public void setAnyo(int anyo) {
	this.anyo = anyo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

@Override
public String toString() {
	return "Pelicula [titulo=" + titulo + ", director=" + director + ", anyo=" + anyo + ", duracion=" + duracion + "]";
}


}
