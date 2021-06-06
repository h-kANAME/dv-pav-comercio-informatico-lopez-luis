package domain;

public class ServicioReparacion extends Servicios {

	private Dificultad dificultad;

	public ServicioReparacion(String nombre, double precioLista, int horasOcupaServicio, Dificultad dificultad) {
		super(nombre, precioLista, horasOcupaServicio);
		this.dificultad = dificultad;
	}

	public Productos clonar(Productos productoClonado) {

		ServicioReparacion productoClonar = (ServicioReparacion) productoClonado;
		ServicioReparacion servicioReparacionClonado = new ServicioReparacion(productoClonar.nombre,
				productoClonar.precioLista, productoClonar.horasOcupaServicio, productoClonar.dificultad);

		return servicioReparacionClonado;

	}

	public double precioDeVenta() {
		double precioVenta = horasOcupaServicio * precioLista;
		return precioVenta;
	}

	public double devolverMontoFacturacion() {
		double montoFacturacion = precioDeVenta() * 1.105;
		return montoFacturacion;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

}
