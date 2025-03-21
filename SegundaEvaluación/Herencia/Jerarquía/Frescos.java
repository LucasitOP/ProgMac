package Jerarquía;

import java.util.Date;

public class Frescos extends Productos {
private Date fecEnvasado;
private String PaisOrigen;
public Frescos(Date fecDeCaducidad, int numLote,Date fecEnvasado, String PaisOrigen) {
	super(fecDeCaducidad, numLote);
	this.fecEnvasado=fecEnvasado;
	this.PaisOrigen=PaisOrigen;

}
public Date getFecEnvasado() {
	return fecEnvasado;
}
public void setFecEnvasado(Date fecEnvasado) {
	this.fecEnvasado = fecEnvasado;
}
public String getPaisOrigen() {
	return PaisOrigen;
}
public void setPaisOrigen(String paisOrigen) {
	PaisOrigen = paisOrigen;
}
@Override
public String toString() {
	return "Frescos [fecEnvasado=" + fecEnvasado + ", PaisOrigen=" + PaisOrigen + "]";
}


}
