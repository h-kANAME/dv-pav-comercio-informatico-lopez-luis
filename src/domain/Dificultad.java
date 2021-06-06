package domain;

public enum Dificultad {

	SIMPLE("Simple", 1), NORMAL("Normal", 2), COMPLEJO("Complejo", 3), AVANZADO("Avanzado", 4), EXPERTO("Experto", 5);

	private String descripcion;
	private int nivel;

	Dificultad(String descripcion, int nivel) {
		this.descripcion = descripcion;
		this.nivel = nivel;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
