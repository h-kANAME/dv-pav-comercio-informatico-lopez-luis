package domain;

public class ServicioReparacion extends Servicios{

	private int dificultad;

	public ServicioReparacion(String nombre, double precioLista, double horasOcupaServicio, int dificultad) {
		super(nombre, precioLista, horasOcupaServicio);
		this.dificultad = dificultad;
	}

	public double calcularPrecioReparacion(double precioLista, double horasOcupaServicio, int dificultad) {
		this.precioLista = 180;
		double costoServicioReparacion = precioLista * horasOcupaServicio;

		if (dificultad > 3) {
			costoServicioReparacion = costoServicioReparacion * 1.25;
		}

		return costoServicioReparacion;

	}

}
