package herencia2;


public class EmpleadoAsalariado extends Empleado {
	
	
	private double salario;
	
	public EmpleadoAsalariado() {
		super();
		System.out.print("Ingresa el salario: ");
		salario = teclado.nextDouble();
	}
	
	public EmpleadoAsalariado(String nombre, String nss, double salario) {
		super(nombre, nss);
		this.salario = salario;
	}
	
	@Override
	public void darAumento(double cantidad) {
		salario += cantidad;
	}
	
	@Override
	public void imprimirCheque() {
		pagaNeta = salario;
		
		System.out.println("Pagar a la orden de "+nombre);
		System.out.println("La suma de "+pagaNeta+" pesos");
		System.out.println("Talon de cheque: NO NEGOCIABLE");
		System.out.println("Numero de empleado: "+nss);
		System.out.println("Empleado asalariado. Paga normal: "+salario);
		System.out.println("---------------------------------------");
	}
}
