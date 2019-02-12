/**
 * 
 * @author azord, Alejandro Martínez
 * @version 1.2
 *
 */

public class Rectangulo_AMS extends FiguraGeometrica_AMS {
	private double l1;
	private double l2;

	/**
	 * Dependiendo del tipo de figura, otorga valores.
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 * 
	 */
	public Rectangulo_AMS(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el area lG*lP
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * Calcula el perimetro 2*lG + 2*lP
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}
}