package poliformismo2;

public class Cuenta {
	
	private double saldo;
	private double tasaInteres;
	
	//constructores
	public Cuenta(int pesos, int centavos, double tasa) {
		
		this.saldo = pesos+centavos;
		this.tasaInteres = tasa;
		
	}
	
	public Cuenta(int pesos, double tasa) {
		
		this.saldo = pesos;
		this.tasaInteres = tasa;
		
	}
	
	public Cuenta() {
		this.saldo = 0;
		this.tasaInteres = 0;
	}
	
	//metodos
	public double actualizar() {
		return saldo * (tasaInteres/100);
	}
	
	public double obtenerSaldo() {
		return saldo + actualizar();
	}
	
	public double obtenerTasa() {
		return tasaInteres;
	}
	
	public void salida() {

		System.out.println("Saldo actual: "+ obtenerSaldo());
		System.out.println("Tasa de interes: "+ obtenerTasa());
		System.out.println("-------------------------");
	}
	
	/*
	private double fraccion(double porciento) {
		return porciento/100;
	}
	*/

}
