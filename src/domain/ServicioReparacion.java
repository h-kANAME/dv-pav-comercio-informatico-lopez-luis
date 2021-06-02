package domain;

public class ServicioReparacion extends Servicios {

	private int dificultad;

	public ServicioReparacion(String nombre, double precioLista, double horasOcupaServicio, double tipoDeIva) {
		super(nombre, precioLista, horasOcupaServicio, tipoDeIva);
		this.dificultad = dificultad;

	}

	public double devolverMontoDeFacturacionReparacion() {

		if (dificultad > 3) {

		}

		return 0;
	}

}
