package CuadernoAbstract;

public abstract class Operacion {
private double valor1,valor2;

Operacion(double valor1,double valor2){
	this.valor1=valor1;
	this.valor2=valor2;
	
}
public abstract double operar();
public double getValor1() {
	return valor1;
}
public void setValor1(double valor1) {
	this.valor1 = valor1;
}
public double getValor2() {
	return valor2;
}
public void setValor2(double valor2) {
	this.valor2 = valor2;
}

}
