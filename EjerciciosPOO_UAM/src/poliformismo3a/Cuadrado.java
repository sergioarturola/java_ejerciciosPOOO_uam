package poliformismo3a;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public void perimetro() {
		System.out.println("El perimetro del cuadrado es: "+ 4*lado);
		
	}

	@Override
	public void area() {
		double area = lado*lado;
		System.out.println("El area del cuadrado es: "+area);
		
	}
	
	

}
