package poliformismo3b;

public class Main {

	public static void main(String[] args) {
		
		Padre p = new Padre();
		System.out.println(p.getX());
		
		Hija h = new Hija();
		h.setX(15);
		System.out.println(h.getX());

	}

}
