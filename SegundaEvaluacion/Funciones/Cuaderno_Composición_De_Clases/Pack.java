package Cuaderno_Composición_De_Clases;

import java.util.Arrays;

public class Pack {
	private String nombrepack;
	private Figura figuras[];

	public Pack(String nombrepack) {
		this.nombrepack = nombrepack;
		this.figuras = new Figura[6];
	}

	public String getNombrepack() {
		return nombrepack;
	}

	public void setNombrepack(String nombrepack) {
		this.nombrepack = nombrepack;
	}

	public Figura[] getFiguras() {
		return figuras;
	}

	public void setFiguras(Figura[] figuras) {
		this.figuras = figuras;
	}

	public boolean AnyadirFigura(Figura figura) {
		boolean añadeonoañade = false;
		for (int i = 0; i < figuras.length; i++) {
			if (this.figuras[i] == null) {
				this.figuras[i] = figura;
				añadeonoañade = true;
				i = figuras.length;
				// También para cerrar el bucle for se podria añadir
				// en el if && encontrado==false
			}
		}
		return añadeonoañade;
	}

	public void subirPrecio(double cantidad, String id) {
		for (int i = 0; i < figuras.length; i++) {
			if (this.figuras[i].getCodigo().equalsIgnoreCase(id)) {
				this.figuras[i].setPrecio(cantidad);
			}
		}
	}

	@Override
	public String toString() {
		return "Pack [nombrepack=" + nombrepack + ", figuras=" + Arrays.toString(figuras) + "]";
	}

	public String masValioso() {
		int valormayor = 0;
		String figuramasvaliosa = "";

		for (int i = 0; i < figuras.length; i++) {
			if (this.figuras[i].getPrecio() > valormayor) {
				figuramasvaliosa = "" + this.figuras[i].getPoke();
			}
		}

		return figuramasvaliosa;
	}

	public double getValorColeccion() {
		double sumadelvalor = 0;
		for (int i = 0; i < figuras.length; i++) {
			sumadelvalor += figuras[i].getPrecio();
		}

		return sumadelvalor;
	}

	public double getVolumenColeccion() {
		double volumentotalcole = 200;
		for (int i = 0; i < figuras.length; i++) {
			volumentotalcole += this.figuras[i].getDimension().CalcularVolumen();
		}
		return volumentotalcole;
	}
}
