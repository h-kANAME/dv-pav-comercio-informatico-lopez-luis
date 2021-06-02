package domain;

public class Servicios extends Productos {

	double horasOcupaServicio;
	double tipoDeIva;

	public Servicios(String nombre, double precioLista, double horasOcupaServicio, double tipoDeIva) {
		super(nombre, precioLista);
		this.horasOcupaServicio = horasOcupaServicio;
		this.tipoDeIva = tipoDeIva;

	}

	public double calcularIvaDelServicio(double precioLista, double horasOcupaServicio) {

		return 0;
	}

	public double getHorasOcupaServicio() {
		return horasOcupaServicio;
	}

	public void setHorasOcupaServicio(double horasOcupaServicio) {
		this.horasOcupaServicio = horasOcupaServicio;
	}

	public double getTipoDeIva() {
		return tipoDeIva;
	}

}
