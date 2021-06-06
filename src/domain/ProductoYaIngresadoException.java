package domain;

public class ProductoYaIngresadoException extends Exception {

	
	private Productos producto;
	
	public ProductoYaIngresadoException() {
		System.out.println("El producto ya ha sido ingresado al historial");
	}

}
