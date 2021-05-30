package domain;

public class Insumos extends Productos implements Matematica {

	private String tipo;
	private double porcentajeGanancia;

	public Insumos(String nombre, double precioLista, String tipo, double porcentajeGanancia) {
		super(nombre, precioLista);
		this.tipo = tipo;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public double precioVenta() {
		return precioLista;

	}

	public double devolverMontoFacturacion() {
		/*
		 * Insumos: Se suma su porcentaje de ganancia al precio de lista, sobre ese
		 * valor se suma el IVA.
		 */
		double porcentajeMatematica = sumarPorcentaje(super.precioLista, this.porcentajeGanancia);
		double montoFacturacion = porcentajeMatematica * 1.21;
		return montoFacturacion;

	}

	private double sumarPorcentaje(double d, double porcentajeGanancia2) {
		// ¿Por que me obliga a crear este metodo si estoy implementando Matematica?
		// Mi intencion es implementar el metodo sumarPorcentaje de la clase Matematica
		// para calcular la suma del porcentaje.
		return 0;
	}

	public Productos clonar(Productos productoClonado) {
		return productoClonado;

	}
}
