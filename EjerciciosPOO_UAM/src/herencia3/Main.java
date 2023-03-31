package herencia3;

public class Main {

	public static void main(String[] args) {
		
		Cilindro uno = new Cilindro();
		uno.setAltura(5);
		uno.setRadio(2);
		
		System.out.println("Area del cilindo: "+uno.getArea());
		System.out.println("Volumen del cilindo: "+uno.getVolumen());

	}

}
