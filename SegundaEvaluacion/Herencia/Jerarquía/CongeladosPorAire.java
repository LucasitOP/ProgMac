package Jerarquía;

import java.util.Date;

public class CongeladosPorAire extends Congelados {
	//Composición del agua todo en %
private double nitrogeno,oxigeno,dioxidoDeCarbono,vaporDeAgua;

public CongeladosPorAire(Date fecDeCaducidad,int numLote,Date fecEnvasado, String paisOrigen, double temperaturaManteRecom,double nitrogeno,double oxigeno, double dioxidoDeCarbon,double VaporDeAgua) {
	super(fecDeCaducidad, numLote, fecEnvasado, paisOrigen, temperaturaManteRecom);
this.nitrogeno=nitrogeno;
this.oxigeno=oxigeno;
this.dioxidoDeCarbono=dioxidoDeCarbon;
this.vaporDeAgua=VaporDeAgua;

}

public double getNitrogeno() {
	return nitrogeno;
}

public void setNitrogeno(double nitrogeno) {
	this.nitrogeno = nitrogeno;
}

public double getOxigeno() {
	return oxigeno;
}

public void setOxigeno(double oxigeno) {
	this.oxigeno = oxigeno;
}

public double getDioxidoDeCarbono() {
	return dioxidoDeCarbono;
}

public void setDioxidoDeCarbono(double dioxidoDeCarbono) {
	this.dioxidoDeCarbono = dioxidoDeCarbono;
}

public double getVaporDeAgua() {
	return vaporDeAgua;
}

public void setVaporDeAgua(double vaporDeAgua) {
	this.vaporDeAgua = vaporDeAgua;
}

@Override
public String toString() {
	return "CongeladosPorAire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxidoDeCarbono="
			+ dioxidoDeCarbono + ", vaporDeAgua=" + vaporDeAgua + "]";
}
public  void descripcion(){
	System.out.println("Soy un producto Congelado por Agua");
	
}
}
