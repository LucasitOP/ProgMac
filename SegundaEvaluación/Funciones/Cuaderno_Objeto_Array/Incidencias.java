package Cuaderno_Objeto_Array;
/*Creamos clase incidencias en la cuál crearemos 
 * Puesto - Motivo y Estado.
 */
public class Incidencias {
	private int puesto;
	private String motivo,estado;
	public int getPuesto() {
		return puesto;
	}
	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//toString que saca todo por pantalla
	@Override
	public String toString() {
		String mensaje="Incidencias [puesto=" + puesto + ", motivo=" + motivo + ", Estado=" + estado + "]";
		return mensaje;
	}
	//constructor vacio
	public Incidencias() {
		
	}
	//constructor con los datos
	public Incidencias(int puesto,String motivo) {
		this.puesto=puesto;
		this.motivo=motivo;
		this.estado="PENDIENTE";
	}
	//Mostrará un listado con las incidencias existentes, el motivo y el estado de ellas.

	
	
	
}
