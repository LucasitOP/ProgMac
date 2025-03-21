package Biblioteca;

public class Libro {
private String titulo,autor,editorial;
private int numPaginas;
private boolean disponible;
public Libro(String titulo,String autor,String editorial,int numPaginas,boolean disponible) {
	this.titulo=titulo;
	this.autor=autor;
	this.editorial=editorial;
	this.numPaginas=numPaginas;
	this.disponible=disponible;
}
}
