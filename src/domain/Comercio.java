package domain;

import domain.ProductoNoEncontradoException;

public class Comercio {

	/*
	 * Un comercio dedicado al rubro informático requiere visualizar estadísticas
	 * sobre el historial de sus operaciones de venta de los productos y/o servicios
	 * que ofrece. El lugar se dedica tanto a vender insumos informáticos como a
	 * ofrecer servicios pre y post venta
	 */

	private Productos[] productosDisponibles;
	private Operaciones[] historialDeOperaciones;

	// El comercio desea saber el monto total facturado y la cantidad de servicios
	// de reparación simple,

	double montoTotalFacturado = 0;
	int cantidadServiciosReparacionSimple = 0;

	/*
	 * El comercio cuenta con un límite de 1000 insumos o servicios que puede
	 * ofrecer como máximo y por ahora solo se podrán agregar más productos a los
	 * existentes mediante los siguientes métodos públicos crearInsumo,
	 * crearServicioDeArmado y crearServicioDeReparacion
	 */

	final int LIMITE = 1000;

	/*
	 * Estos métodos crearan una instancia de cada Producto y lo agregarán a los
	 * productos disponibles para la venta, siempre y cuando no exista ya un
	 * Producto agregado con el mismo nombre, en ese caso se debe lanzar una
	 * excepción ProductoYaIngresadoException que indique el producto ya está
	 * ingresado. Para ello hay que implementar el método equals por el nombre del
	 * Producto.
	 * 
	 */

	public Productos crearInsumos(String nombre, double precioLista, Tipo tipoInsumo, double porcentajeGanancia)
			throws ProductoYaIngresadoException {

		return null;

	}

	public Productos crearServicioDeArmado(String nombre, double precioLista, int horasOcupaServicio)
			throws ProductoYaIngresadoException {

		return null;

	}

	public Productos crearServicioDeReparacion(String nombre, double precioLista, int horasOcupaServicio,
			Dificultad dificultad) throws ProductoYaIngresadoException {

		return null;

	}

	/*
	 * También debe existir un método buscarProductoPorNombre que se le pasa el
	 * nombre del producto y devuelve la instancia que se encuentra entre los
	 * productos disponibles. En caso de que no se encuentre debe retornar una
	 * excepción ProductoNoEncotradoException que indique que el producto no se ha
	 * encontrado.
	 * 
	 * public Productos buscarProductoPorNombre(String nombre) throws
	 * ProductoNoEncontradoException { return null; }
	 */

//	public Productos buscarProductoPorNombre(String nombre) throws ProductoNoEncontradoException{

	// return null;
	// }

	/*
	 * Además un método modificarPrecioListaProducto que debe recibir el nombre del
	 * Producto y el nuevo precio de lista. Esté método debe buscar el producto en
	 * los disponibles y modificar su precio de lista, siguiendo las reglas de cada
	 * insumo o servicio.
	 */

	public void modificarPrecioListaProducto(double precioLista) { // Sin alterar la historia
		
		
	}

	/*
	 * El comercio debe contener un método addOperacion que luego de clonar el
	 * Producto lo agregue al historial de operaciones.
	 */

	public void addOperacion(String string, double precioLista, Tipo tipoInsumo, int porcentajeGanancia) {

	}

	/*
	 * También el comercio debe tener un par de métodos para ver el contenido de los
	 * productos disponibles para la venta y el historial de operaciones
	 */

	public void mostrarHistorialDeOperaciones(Operaciones operacion) {

	}

	public void mostrarProductoDisponibleParaVenta(Productos producto) { //

	}

	

	public double getMontoTotalFacturado() {
		return montoTotalFacturado;
	}

	public int getCantidadServiciosReparacionSimple() {
		return cantidadServiciosReparacionSimple;
	}

}
