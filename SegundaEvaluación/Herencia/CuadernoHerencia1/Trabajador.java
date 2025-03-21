package CuadernoHerencia1;

public class Trabajador extends Persona {
private CategoriaProfesional categoria;
private int antiguedad;
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	public Trabajador(String nombre,int telefono,int edad,CategoriaProfesional categoria, int antiguedad) {
		super(nombre,telefono,edad);
		this.categoria=categoria;
		this.antiguedad=antiguedad;
	}
	public CategoriaProfesional getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProfesional categoria) {
		this.categoria = categoria;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public String toString() {
		return super.toString()+" Trabajador:"+ "categoria=" + categoria + ", antiguedad=" + antiguedad ;
	}

}
