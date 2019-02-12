
public class Triangulo_AMS extends FiguraGeometrica_AMS {
	/**
	 * @param triangulo_AMS
	 * @return
	 */
	public static double semiPerimetro(Triangulo_AMS triangulo_AMS) {
		return triangulo_AMS.semiPerimetro();
	}

	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_AMS(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = Triangulo_AMS.semiPerimetro(this);
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
 }