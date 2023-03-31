package herencia4b;

public class Motocicleta implements Motor, Bicicleta {

	@Override
	public void rodar() {
		System.out.println("empiezo a rodar");
		
	}

	@Override
	public void frenar() {
		System.out.println("detenido");
		
	}

	@Override
	public void encender() {
		System.out.println("Encendido");
		
	}

	@Override
	public void apagar() {
		System.out.println("APAGADO");
		
	}
	
	public void pasear() {
		encender();
		rodar();
		frenar();
		apagar();
	}
	 

}
