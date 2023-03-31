package poliformismo3a;

public class Circulo extends Figura {

	private double radio;
	final double pi = 3.1416;
	
	public Circulo(int radio) {
		this.radio = radio;
	}

	@Override
	public void perimetro() {
		double perimetro = 2*pi*radio;
		System.out.println("El perimetro del circulo es: "+perimetro);
		
	}

	@Override
	public void area() {
		double area = pi * (radio*radio);
		System.out.println("El area del circulo es: "+area);
		
	}

}
