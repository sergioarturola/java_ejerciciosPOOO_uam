package poliformismo;

public class Main {

	public static void main(String[] args) {
		Calculadora operacion = new Calculadora();

		System.out.println("Suma de 2 palabras: " + operacion.sumar("hola", "mundo"));
		System.out.println("Suma de 3 enteros: " + operacion.sumar(10, 33, 7));
		System.out.println("Suma de 3 decimales: "+ operacion.sumar(23.55, 17.89));
		System.out.println("Resta de 3 enteros: "+ operacion.resta(110, 34, 7));
		System.out.println("Multiplicacion de 2 enteros: "+ operacion.multiplicacion(5, 4));
		System.out.println("Division de 2 numeros: "+ operacion.division(80, 2));
		System.out.println("Division si el divisor es cero: "+ operacion.division(56.8, 0));

	}

}
