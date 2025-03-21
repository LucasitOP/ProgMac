package Biblioteca;

public class Usuario {
private String nombre;
private Libro []librosencasa=new Libro[3];

public Usuario(String nombre,Libro[] libro) {
	this.nombre=nombre;
	this.librosencasa=libro;
}

}
