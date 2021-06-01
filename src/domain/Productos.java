package domain;

public abstract class Productos implements Matematica {

	String nombre;
	double precioLista;

	public Productos(String nombre, double precioLista) {
		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	public Productos clonar(Productos productos) {
		return productos;

	}

	public double precioVenta() {
		return precioLista;

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

	public String getNombre() {
		return nombre;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precioLista=" + precioLista + "]";
	}
	
	
	
	

}
