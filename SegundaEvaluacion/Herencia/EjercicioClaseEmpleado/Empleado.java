package EjercicioClaseEmpleado;

public class Empleado {
private String nombre;
private double salario;
private int edad;
public Empleado(String nombre,double salario,int edad) {
	this.nombre=nombre;
	this.salario=salario;
	this.edad=edad;
}
public double calcularSalario() {
	return salario;
}
}
