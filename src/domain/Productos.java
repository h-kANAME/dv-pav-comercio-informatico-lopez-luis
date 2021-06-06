package domain;

public abstract class Productos {

	protected String nombre;
	protected double precioLista;

	public Productos(String nombre, double precioLista) {
		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	public abstract Productos clonar(Productos producto);

	public abstract double devolverMontoFacturacion();

	public abstract double precioDeVenta();
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precioLista);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productos other = (Productos) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precioLista) != Double.doubleToLongBits(other.precioLista))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precioLista=" + precioLista + "]";
	}

}
