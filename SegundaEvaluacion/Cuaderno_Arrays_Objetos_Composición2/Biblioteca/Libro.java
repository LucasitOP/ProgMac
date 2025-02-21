package Biblioteca;

public class Libro {
    private String titulo, autor, editorial;
    private int numPaginas;
    private boolean disponible;

    public Libro(String titulo, String autor, String editorial, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.disponible = true; // Comienza disponible
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    @Override
    public String toString() {
        String estado;
        if (disponible) {
            estado = "Disponible";
        } else {
            estado = "No disponible";
        }
        return titulo + " - " + autor + " (" + editorial + "), " + numPaginas + " páginas - " + estado;
    }
}