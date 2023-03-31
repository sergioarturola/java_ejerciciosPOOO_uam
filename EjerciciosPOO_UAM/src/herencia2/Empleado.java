package herencia2;
import java.util.Scanner;

public class Empleado {
	
	Scanner teclado = new Scanner(System.in);
	protected String nombre;
	protected String nss;
	protected double pagaNeta;
	
	public Empleado() {
		System.out.print("Escribe nombre del empleado: ");
		nombre = teclado.nextLine();
		System.out.print("EScribe tu numero de seguridad social: ");
		nss = teclado.nextLine();
	}
	
	public Empleado(String nombre, String nss) {
		this.nombre = nombre;
		this.nss = nss;
				
	}
	
	public void imprimirCheque() {
		System.out.println("Error");
	}
	
	public void darAumento(double cantidad) {
		System.out.println("Error");
	}
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
