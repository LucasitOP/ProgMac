package Jerarquía;

import java.util.Date;

public class Refrigerados extends Productos {
private long codOrganismoSupervision;
private Date fecEnvasado;
private double temperaturaRecom;
private String paisOrigen;



public Refrigerados(Date fecDeCaducidad, int numLote,long codOrganismoSupervision, Date fecEnvasado, double temperaturaRecom, String paisOrigen) {
	super(fecDeCaducidad, numLote);
	this.codOrganismoSupervision = codOrganismoSupervision;
	this.fecEnvasado = fecEnvasado;
	this.temperaturaRecom = temperaturaRecom;
	this.paisOrigen = paisOrigen;}



public long getCodOrganismoSupervision() {
	return codOrganismoSupervision;
}
public void setCodOrganismoSupervision(long codOrganismoSupervision) {
	this.codOrganismoSupervision = codOrganismoSupervision;
}
public Date getFecEnvasado() {
	return fecEnvasado;
}
public void setFecEnvasado(Date fecEnvasado) {
	this.fecEnvasado = fecEnvasado;
}
public double gettemperaturaRecom() {
	return temperaturaRecom;
}
public void setTemperaturaRecom(double temperaturaRecom) {
	this.temperaturaRecom = temperaturaRecom;
}
public String getPaisOrigen() {
	return paisOrigen;
}
public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}

@Override
public String toString() {
	return "Refrigerados [codOrganismoSupervision=" + codOrganismoSupervision + ", fecEnvasado=" + fecEnvasado
			+ ", temperaturaRecom=" + temperaturaRecom + ", paisOrigen=" + paisOrigen + "]";
}

}
