package CuadernoInterface2;

public abstract class Publicacion {

	private String codigo;
	private int anyoPublicacion;
	
	 Publicacion(String codigo,int anyoPublicacion){
		 this.setCodigo(codigo);
		 this.setAnyoPublicacion(anyoPublicacion);
	 }
	@Override
	public abstract String toString();
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	public boolean ComprobarISSN(Publicacion[]array,Publicacion publi) {
		
		for(int i=0;i<array.length;i++) {
			if(publi.getCodigo().equalsIgnoreCase(array[i].getCodigo())) {
				return false;
			}
		}
		
		
		return true;
		
	}
	public boolean ComprobarISBN(Publicacion[]array,Publicacion publi) {
		int contador=0;
		for(int i=0;i<array.length;i++) {
			if(publi.getCodigo().equalsIgnoreCase(array[i].getCodigo())) {
				contador++;
			}
			if(contador>5) {
				return false;
			}
		}
		
		
		return true;
		
	}
	
}
