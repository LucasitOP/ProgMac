package Cuaderno_Ambitos;

public class Electrodomestico {
private String tipo;
private String marca;
private double potencia;


public Electrodomestico(String tipo, String marca, double potencia) {
	this.tipo = tipo;
	this.marca = marca;
	this.potencia = potencia;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public double getPotencia() {
	return potencia;
}


public void setPotencia(double potencia) {
	this.potencia = potencia;
}



public double getConsumo(int horasutilizado) {
	// Para sacar el consumo utilizamos la potencia*horasutilizado:
	double Consumo= potencia*horasutilizado;
	return Consumo;
}

public double getCosteConsumo(int horas,double costeHora) {
	
	double costeTotal=costeHora*horas;

	return costeTotal;
}


@Override
public String toString() {
	String cadena="Electrodomestico [tipo=\" + tipo + \", marca=\" + marca + \", potencia=\" + potencia + \"]";
	return cadena;
}


}
