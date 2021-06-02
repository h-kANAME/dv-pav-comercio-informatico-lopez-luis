package domain;

public class Insumos extends Productos implements Matematica{ //MatematicaStatic

	private String tipo;
	private double porcentajeGanancia;

	public Insumos(String nombre, double precioLista, String tipo, double porcentajeGanancia) {
		super(nombre, precioLista);
		this.tipo = tipo;
		this.porcentajeGanancia = porcentajeGanancia;
	}

//	public double precioVenta() {
//		return MatematicaStatic.sumarPorcentaje(getPrecioLista(), porcentajeGanancia);
//
//	}

	public double devolverMontoFacturacion() {
		/*
		 * Insumos: Se suma su porcentaje de ganancia al precio de lista, sobre ese
		 * valor se suma el IVA.
		 */
		double porcentajeMatematica = sumarPorcentaje(super.precioLista, this.porcentajeGanancia);
		double montoFacturacion = porcentajeMatematica * 1.21;
		return montoFacturacion;

	}

	public Productos clonar(Productos productoClonado) {
		return productoClonado;

	}
}
