package test;

import domain.Comercio;
import domain.Dificultad;
import domain.Productos;
import domain.Tipo;
import domain.ProductoNoEncontradoException;
import domain.ProductoNoExistenteException;
import domain.ProductoYaIngresadoException;

public class ComercioTest {

	public static void main(String[] args) throws Throwable {

		// 3.1. Se debe crear al menos un producto de cada tipo, agregarlo al inventario
		// de venta y simular la operación de venta de cada uno de ellos.

		Comercio KYZTechnology = new Comercio();

		Productos mauseRazerChroma = KYZTechnology.crearInsumos("Mause_Razer_Chroma", 10500.75, Tipo.PERIFERICO, 35);
		Productos aireComprimidoAerosol = KYZTechnology.crearInsumos("AireComprimidoEnAerosol", 760.70, Tipo.LIMPIEZA,
				35);
		Productos microIntelI8350u = KYZTechnology.crearInsumos("MicroProcesadorIntel(i7 8350U)", 77760.70,
				Tipo.HARDWARE, 35);

		Productos servicioArmado = KYZTechnology.crearServicioDeArmado("ArmadoPC", 180, 3);
		Productos servicioReparado = KYZTechnology.crearServicioDeReparacion("ReparacionPC", 250, 2, Dificultad.SIMPLE);

		KYZTechnology.addOperacion("Mause_Razer_Chroma", 10500.75, Tipo.PERIFERICO, 35);
		KYZTechnology.addOperacion("AireComprimidoEnAerosol", 760.70, Tipo.LIMPIEZA, 35);
		KYZTechnology.addOperacion("MicroProcesadorIntel(i7 8350U)", 77760.70, Tipo.HARDWARE, 35);

		/*
		 * 3.2. También se debe verificar el correcto lanzamiento de las excepciones
		 * indicadas, para los tres casos
		 */

		try {
			KYZTechnology.crearInsumos("Mause_Razer_Chroma", 10500.75, Tipo.PERIFERICO, 35);
		} catch (ProductoYaIngresadoException e) {
			e.printStackTrace();
		}

//		try {
//			KYZTechnology.buscarProductoPorNombre("Mause_Razer");
//		} catch (ProductoNoEncontradoException e) {
//			e.printStackTrace();
//		}

//		try {
//			KYZTechnology.addOperacion("Mause_Chroma", 10500.75, Tipo.PERIFERICO, 35);
//		} catch (ProductoNoExistenteException e) {
//			e.printStackTrace();
//		}

		/*
		 * 3.3. Se debe modificar el precio de al menos uno de los productos para la
		 * venta y que esta operación no afecte el producto en el historial.
		 */

		mauseRazerChroma.setPrecioLista(500);

		/*
		 * 3.4. Se debe mostrar al final de la ejecución el listado de los productos
		 * disponibles.
		 */

		KYZTechnology.mostrarProductoDisponibleParaVenta(null);

		/*
		 * 3.5. Se debe mostrar al final de la ejecución el listado de los producto en
		 * el historial.
		 */

		KYZTechnology.mostrarHistorialDeOperaciones(null);

		/*
		 * 3.6. Se debe mostrar la final de la ejecución el monto total facturado.
		 */

		KYZTechnology.getMontoTotalFacturado();

		/*
		 * 3.7. Se debe mostrar la final de la ejecución la cantidad de servicios
		 * simples.
		 */
		
		KYZTechnology.getCantidadServiciosReparacionSimple();
		
	}

}
