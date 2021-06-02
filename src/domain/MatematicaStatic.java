package domain;

public interface MatematicaStatic {

	public static double sumarPorcentaje(Double valor, Double porcentaje) {
		Double resultado = 0.0;
		Double delta = (valor.doubleValue() * porcentaje.doubleValue() / 100);
		resultado = valor + delta;
		return resultado;
	}

}
// Sin efecto, se uso para entender un concepto