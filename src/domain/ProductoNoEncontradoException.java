package domain;

public class ProductoNoEncontradoException {

	private Productos producto;

	public ProductoNoEncontradoException() {
		System.out.println("El producto no se encuentra en la lista");
	}

}
