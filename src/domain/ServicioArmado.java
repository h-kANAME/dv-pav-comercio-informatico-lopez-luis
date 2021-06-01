package domain;

public class ServicioArmado extends Servicios{

	public ServicioArmado(String nombre, double precioLista, double horasOcupaServicio) {
		super(nombre, precioLista, horasOcupaServicio);
	}

	public double calcularPrecioArmado(double precioLista, double horasOcupaServicio) {
		this.precioLista = 250;
		double costoServicioArmado = precioLista * horasOcupaServicio;

		return costoServicioArmado;

	}

}
