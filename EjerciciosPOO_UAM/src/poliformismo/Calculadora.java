package poliformismo;

public class Calculadora {
	
	//suma
	public String sumar(String palabra1, String palabra2) {
		return palabra1+palabra2;
	}
	
	public String sumar(String palabra1, String palabra2, String palabra3) {
		return palabra1+palabra2+palabra3;
	}
	

	public int sumar(int x, int y) {
		return x+y;
	}
	
	public int sumar(int x, int y, int z) {
		return x+y+z;
	}
	
	public double sumar(double x, double y) {
		return x+y;
	}
	
	public double sumar(double x, double y, double z) {
		return x+y+z;
	}
	
	//resta
	public int resta(int x, int y) {
		return x-y;
	}
	
	public int resta(int x, int y, int z) {
		return x-y-z;
	}
	
	public double resta(double x, double y) {
		return x-y;
	}
	
	public double resta(double x, double y, double z) {
		return x-y-z;
	}
	
	//multiplicacion
	public int multiplicacion(int x, int y) {
		return x*y;
	}
	
	public int multiplicacion(int x, int y, int z) {
		return x*y*z;
	}
	
	public double multiplicacion(double x, double y) {
		return x*y;
	}
	
	public double multiplicacion(double x, double y, double z) {
		return x*y*z;
	}
	
	//division
	
	public int division(int x, int y) {
		if(y == 0) {
			return 0;
		}
		else {
			return x*y;
		}
		
	}
	
	
	public double division(double x, double y) {
		if(y == 0) {
			return 0;
		}
		else {
			return x*y;
		}
		
	}
	
}
