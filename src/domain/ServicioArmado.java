package domain;

public class ServicioArmado extends Servicios {

	public ServicioArmado(String nombre, double precioLista, int horasOcupaServicio) {
		super(nombre, precioLista, horasOcupaServicio);
		// TODO Auto-generated constructor stub
	}

	public double precioDeVenta() {
		double precioVenta = horasOcupaServicio * precioLista;
		return precioVenta;
	}

	public double devolverMontoFacturacion() {

		double montoFacturacion = precioDeVenta() * 1.105;
		return montoFacturacion;

	}

	public Productos clonar(Productos productoClonado) {
		ServicioArmado productoClonar = (ServicioArmado) productoClonado;
		ServicioArmado servicioArmadoClonado = new ServicioArmado(productoClonar.nombre, productoClonar.precioLista,
				productoClonar.horasOcupaServicio);

		return servicioArmadoClonado;

	}

}
