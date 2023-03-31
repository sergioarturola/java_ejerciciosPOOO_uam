package herencia2;

public class EmpleadoDestajo extends Empleado {
	
	private double tarifaHora;
	private int horas;
	
	public EmpleadoDestajo() {
		super();
		System.out.print("Ingresa la tarifa por hora: ");
		tarifaHora = teclado.nextDouble();
		System.out.print("Ingresa horas trabajadas: ");
		horas = teclado.nextInt();
	}
	
	
	public EmpleadoDestajo(String nombre, String nss, double tarifaHora, int horas) {
		super(nombre, nss);
		this.tarifaHora = tarifaHora;
		this.horas = horas;
	}
	
	public void incrementarTiempo(int incremento) {
		horas += incremento;
	}
	
	@Override
	public void darAumento(double cantidad) {
		tarifaHora += cantidad;
	}
	
	@Override
	public void imprimirCheque() {
		pagaNeta = horas*tarifaHora;
		
		System.out.println("Pagar a la orden "+nombre);
		System.out.println("La suma "+pagaNeta+" pesos");
		System.out.println("Talon de cheque: NO NEGOCIABLE");
		System.out.println("Numero de empleado: "+nss);
		System.out.println("Empleado a destajo. Horas laboradas: "+horas+" Tarifa "+tarifaHora+" Paga neta "+pagaNeta);
		System.out.println("---------------------------------------");
	}
	
	

}
