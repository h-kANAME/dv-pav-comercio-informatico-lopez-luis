package domain;

public abstract class Servicios extends Productos {

	protected int horasOcupaServicio;

	public Servicios(String nombre, double precioLista, int horasOcupaServicio) {
		super(nombre, precioLista);
		this.horasOcupaServicio = horasOcupaServicio;
	}

	public double getHorasOcupaServicio() {
		return horasOcupaServicio;
	}

	public void setHorasOcupaServicio(int horasOcupaServicio) {
		this.horasOcupaServicio = horasOcupaServicio;
	}
	
	

}
