package herencia3;

public class Circulo extends Punto {
	
	private double radio;
	
	public Circulo() {
		super();
		this.radio = 0;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio*2;
	}
	
	public double getCircunferencia() {
		return getDiametro()*3.1416;
	}
	
	public double getArea() {
		double area = 3.1416 * (radio*radio);
		return area;
	}

}