package domain;

public class ProductoNoExistenteException extends Exception {
	
	public ProductoNoExistenteException() {
		System.out.println("Imposible agregar producto al historial, el mismo es NULO");
	}

}
