package domain;

import java.util.ArrayList;
import java.util.List;

public class Comercio {

	private ArrayList<Productos> producto;
	private ArrayList<Operaciones> operacion;

	public void crearInsumos(Productos producto) {
		if (producto == null) {
			this.producto = new ArrayList<Productos>();
		}
		this.producto.add(producto);

	}

	public void buscarProductoPorNombre() {

	}

	public void modificarPrecioListaProducto() {

	}

	public void addOperacion(Operaciones operacion) {
		if (producto == null) {

			this.operacion = new ArrayList<Operaciones>();

		}
		this.operacion.add(operacion);
	}

	// También el comercio debe tener un par de métodos para ver el contenido de los
	// productos disponibles para la venta y el historial de operaciones

	public void mostrarHistorialDeOperaciones() {

	}

	public void mostrarProductoDisponibleParaVenta() {

	}

}
