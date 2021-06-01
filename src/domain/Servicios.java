package domain;

public class Servicios extends Productos implements Matematica {

	double horasOcupaServicio;
	double tipoDeIva = 21;

	public Servicios(String nombre, double precioLista, double horasOcupaServicio) {
		super(nombre, precioLista);
		this.horasOcupaServicio = horasOcupaServicio;

	}

	public double devolverMontoFacturacion() {

		/*
		 * Servicios: Se suma la mitad del IVA sobre su precio. En todos los casos el
		 * IVA es del 21%.
		 */

		if (tipoDeIva == 21) {
			tipoDeIva = 21 / 2;
			double importeIva = (super.precioLista * tipoDeIva) / 100;
			double montoFacturacion = importeIva;
			return montoFacturacion;
		} else {
			return 0;
		}

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
