package herencia2;

public class Main {

	public static void main(String[] args) {
		
		EmpleadoAsalariado uno = new EmpleadoAsalariado("Carlos Castillo", "323PER", 5000);
		uno.darAumento(1500.50);
		uno.imprimirCheque();
		
		EmpleadoDestajo dos = new EmpleadoDestajo("Pepito Gomez","793GVS", 50, 7);
		dos.imprimirCheque();
		
		EmpleadoAsalariado tres = new EmpleadoAsalariado();
		tres.imprimirCheque();
		

	}

}
