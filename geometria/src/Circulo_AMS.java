
public class Circulo_AMS extends FiguraGeometrica_AMS {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_AMS(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		radio= (double) Math.abs(r);
		
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}
}