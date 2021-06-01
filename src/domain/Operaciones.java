package domain;

public class Operaciones extends Productos {

	private String nombre;
	private String fechaVenta;
	private double precioLista;

	public Operaciones(String nombre, double precioLista, String fechaVenta) {
		super(nombre, precioLista);
		this.fechaVenta = fechaVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	@Override
	public String toString() {
		return "Operaciones [Nombre: " + nombre + ", Fecha de Venta: " + fechaVenta + ", Precio de Lista: "
				+ precioLista + "]";
	}

}
