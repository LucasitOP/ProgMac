package ENUM_Cuaderno;

public enum Mes {
ENERO(Estacion.INVIERNO),FEBRERO(Estacion.INVIERNO),MARZO(Estacion.INVIERNO),ABRIL(Estacion.PRIMAVERA),MAYO(Estacion.PRIMAVERA),JUNIO(Estacion.VERANO),JULIO(Estacion.VERANO),AGOSTO(Estacion.VERANO),SEPTIEMBRE(Estacion.VERANO),OCTUBRE(Estacion.OTOÑO),NOVIEMBRE(Estacion.OTOÑO),DICIEMBRE(Estacion.INVIERNO);
	 
	private Estacion estacion;
	
	Mes(Estacion estacion)
	{
		this.estacion=estacion;
	}

	public Estacion getEstacion() {
		return estacion;
	}
	
}
