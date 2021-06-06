package domain;

public class Insumos extends Productos implements Matematica {

	private Tipo tipoInsumo; // No lo puse aun en el constructor
	private double porcentajeGanancia;

	public Insumos(String nombre, double precioLista, Tipo tipoInsumo, double porcentajeGanancia) {
		super(nombre, precioLista);
		this.tipoInsumo = tipoInsumo;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public double precioDeVenta() {
		porcentajeGanancia = MatematicaStatic.sumarPorcentaje(getPrecioLista(), porcentajeGanancia);
		double precioVenta = porcentajeGanancia + precioLista;
		return precioVenta;
	}

	public double devolverMontoFacturacion() {
		/*
		 * Insumos: Se suma su porcentaje de ganancia al precio de lista, sobre ese
		 * valor se suma el IVA.
		 */
		double montoFacturacion = precioDeVenta() * 1.21;
		return montoFacturacion;

	}

	public Productos clonar(Productos productoClonado) {
		Insumos productoClonar = (Insumos) productoClonado;
		Insumos insumoClonado = new Insumos(productoClonar.nombre, productoClonar.precioLista,
				productoClonar.tipoInsumo, productoClonar.porcentajeGanancia);

		return insumoClonado;

	}

}
