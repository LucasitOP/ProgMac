package CuadernoInterface2;

public class Revista extends Publicacion {

	private int numero;
	
	public Revista(String codigo,int anyoPublicacion,int numero) {
		super(codigo,anyoPublicacion);
		this.numero=numero;
		
	}

	@Override
	public String toString() {
		return "Revista:"+"ISSN:"+getCodigo()+"año de publicacion:"+getAnyoPublicacion()+"numero=" + numero ;
	}
	
	
	
}
