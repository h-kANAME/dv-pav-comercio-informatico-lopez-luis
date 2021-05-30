package domain;

import java.util.ArrayList;
import java.util.List;

public class Comercio {

	private ArrayList<Productos> producto;
	private ArrayList<Productos> historialOperaciones;
	private ArrayList<Productos> servicioArmado;
	private ArrayList<Productos> servicioReparacion;

	public void crearInsumos(Productos producto) {
		if (producto == null) {
			this.producto = new ArrayList<Productos>();
		}
		this.producto.add(producto);

	}

	public void crearServicioDeArmado(Productos servicioArmado) {
		if (servicioArmado == null) {
			this.servicioArmado = new ArrayList<Productos>();
		}
		this.servicioArmado.add(servicioArmado);
	}

	public void crearServicioDeReparacion(Productos servicioReparacion) {
		if (servicioReparacion == null) {
			this.servicioReparacion = new ArrayList<Productos>();
		}
		this.servicioReparacion.add(servicioReparacion);
	}

	public void buscarProductoPorNombre() {

	}
	
	public void modificarPrecioListaProducto () {
		
	}

	public void addOperacion() {

	}
	
	// También el comercio debe tener un par de métodos para ver el contenido de los
	// productos disponibles para la venta y el historial de operaciones

	public void mostrarHistorialDeOperaciones() {

	}

	public void mostrarProductoDisponibleParaVenta() {

	}
	
	

}
