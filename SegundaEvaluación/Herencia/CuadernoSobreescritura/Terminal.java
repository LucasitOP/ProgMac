package CuadernoSobreescritura;

public class Terminal {
private String numeroDeTelefono;
private double segundosDeConversacion;

public Terminal(String numeroDeTelefono) {
	this.numeroDeTelefono=numeroDeTelefono;
	
	
}


public String getNumerodetelefono() {
	return numeroDeTelefono;
}

public void setNumerodetelefono(String numeroDeTelefono) {
	this.numeroDeTelefono = numeroDeTelefono;
}

public double getSegundosdeconversacion() {
	return segundosDeConversacion;
}

public void setSegundosdeconversacion(double segundosDeConversacion) {
	this.segundosDeConversacion += segundosDeConversacion;
}




public void llama(Terminal t, int cantidadDeSegundos) {
	
	setSegundosdeconversacion(cantidadDeSegundos);
	t.setSegundosdeconversacion(cantidadDeSegundos);

}


@Override
public String toString() {
	return "Nº "+numeroDeTelefono+" - "+segundosDeConversacion+"s de conversacion";
}




}
