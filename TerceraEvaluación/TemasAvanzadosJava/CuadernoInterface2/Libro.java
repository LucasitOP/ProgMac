package CuadernoInterface2;

public class Libro extends Publicacion implements Prestable 
{
	private String autor,titulo;
	private boolean sePuedePrestar;
	public Libro(String codigo, int anyoPublicacion,String autor,String titulo,boolean sePuedePrestar) {
		super(codigo, anyoPublicacion);
		this.autor=autor;
		this.titulo=titulo;
		this.sePuedePrestar=sePuedePrestar;
	}

	@Override
	public void prestar() {
		sePuedePrestar=false;
	}

	@Override
	public void devolver() {
		sePuedePrestar=true;
	}

	@Override
	public boolean estaPrestado() {
		return sePuedePrestar;
	}

	@Override
	public String toString() {
		return "Libro:"+"ISBN:"+getCodigo()+"año de publicacion:"+getAnyoPublicacion()+" autor=" + autor + ", titulo=" + titulo + ", sePuedePrestar=" + sePuedePrestar;
	}
	
	
}
