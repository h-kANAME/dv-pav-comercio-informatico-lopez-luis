package domain;

public class Servicios extends Productos implements Matematica {

	double horasOcupaServicio;

	public Servicios(String nombre, double precioLista, double horasOcupaServicio) {
		super(nombre, precioLista);
		this.horasOcupaServicio = horasOcupaServicio;

	}

	public void calcularPrecioServicio() {
	}
}
