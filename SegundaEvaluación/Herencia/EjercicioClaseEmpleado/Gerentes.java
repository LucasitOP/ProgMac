package EjercicioClaseEmpleado;

public class Gerentes extends Empleado {
private double bonoliderazgo;

public Gerentes(String nombre,double salario,int edad,double bonoliderazgo) {
	super(nombre,salario,edad);
	this.bonoliderazgo=bonoliderazgo;
}

public double calcularSalario() {
	return super.calcularSalario()+bonoliderazgo;
	
}
}
