package herencia3;

public class Cilindro extends Circulo {
	
	private double altura;
	
	public Cilindro() {
		super();
		this.altura = 0;
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		
		return (2*3.1416)*getRadio()*(getRadio() + this.altura);
	}
	
	public double getVolumen() {
		
		return (3.1416 * (getRadio()*getRadio()))*this.altura;
	}

}
