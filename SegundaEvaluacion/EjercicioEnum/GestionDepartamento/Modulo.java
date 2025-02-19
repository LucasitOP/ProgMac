package GestionDepartamento;

public enum Modulo {
	BASEDEDATOS("BBDD",Ciclo.DAW,1),
	PROGRAMACION("Prog",Ciclo.DAW,1),
	ENTORNOS("Entornos",Ciclo.DAW,1),
	SISTEMAS("Sistemas",Ciclo.DAW,1),
	LENGUAJES("Lenguajes",Ciclo.DAW,1),
	POW("Pow",Ciclo.DAW,1),
	IPE("Ipe",Ciclo.DAW,1),
	PROGM("Programacion multiplataforma",Ciclo.DAM,1);
	
	private Ciclo ciclo;
	private String descripcion;
	private int curso;
	private String id;
	
	Modulo( String descripcion,Ciclo ciclo, int curso) {
		this.descripcion=descripcion;
		this.ciclo=ciclo;
		
		this.curso=curso;
		this.id=curso+"_"+ciclo.name()+"_"+descripcion.substring(0,2).toUpperCase();
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Descripción: " + descripcion + ", Ciclo: " + ciclo + ", Curso: " + curso;
	}
}
