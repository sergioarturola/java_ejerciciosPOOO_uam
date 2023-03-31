package herencia4a;

public class Grifo implements Aguila, Leon {

	@Override
	public void correr() {
		System.out.println("Estoy corriendo como leon");
		
	}

	@Override
	public void volar() {
		System.out.println("Estoy volando como aguila");
		
	}
	
	public void saludar() {
		volar();
		correr();
	}

}
