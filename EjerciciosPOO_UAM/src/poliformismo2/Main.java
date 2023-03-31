package poliformismo2;

public class Main {

	public static void main(String[] args) {
		
		Cuenta normal = new Cuenta(300, 10);
		Cuenta senior = new Cuenta(400, 10, 20);
		Cuenta cero = new Cuenta();
		
		normal.salida();
		senior.salida();
		cero.salida();


	}

}
