package domain;

public class ServicioArmado extends Servicios {

	public ServicioArmado(String nombre, double precioLista, double horasOcupaServicio, double tipoDeIva) {
		super(nombre, precioLista, horasOcupaServicio, tipoDeIva);

	}

	public double devolverMontoDeFacturacionArmado() {

		return 0;

	}

}
