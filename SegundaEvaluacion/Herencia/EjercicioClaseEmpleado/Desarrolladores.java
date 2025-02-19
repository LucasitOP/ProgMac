package EjercicioClaseEmpleado;

public class Desarrolladores extends Empleado {
private double ValorHora;
private double horasExtra;

public Desarrolladores(String nombre,double salario,int edad,double ValorHora,double horasExtra) {
	super(nombre,salario,edad);
	this.ValorHora=ValorHora;
	this.horasExtra=horasExtra;
}

public double calcularSalario() {
	return super.calcularSalario()+(ValorHora*horasExtra);
	
}

}
