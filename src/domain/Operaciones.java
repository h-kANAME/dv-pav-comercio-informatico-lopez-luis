package domain;

public class Operaciones {

	private Productos producto;
	private String nombre;
	private double precioLista;
	private double montoFacturado;

	public Operaciones(Productos producto, String nombre, double precioLista, double montoFacturado) {
		this.producto = producto;
		this.nombre = nombre;
		this.precioLista = precioLista;
		this.montoFacturado = montoFacturado;
	}

	public Productos getProducto() {
		return producto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public double getMontoFacturado() {
		return montoFacturado;
	}

}
