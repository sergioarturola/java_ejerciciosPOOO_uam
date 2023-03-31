package poliformismo3a;

public class Main {
	public static void main(String []args) {
		
		Circulo c1 = new Circulo(5);
		Cuadrado cua = new Cuadrado(7);
		
		c1.perimetro();
		c1.area();
		
		cua.perimetro();
		cua.area();
		
		Triangulo t1 = new Triangulo(10,15,15);
		t1.perimetro();
		t1.area();
		
		Triangulo t2 = new Triangulo(8,8,8);
		t2.perimetro();
		t2.area();
		
		Triangulo t3 = new Triangulo(12,5,35);
		t3.perimetro();
		t3.area();
		
	}
   
}
