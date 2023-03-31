package herencia1;

public abstract class Persona {
	private String profesion;
	private int edad;
	
	public Persona() {
		profesion = "desempleado";
		edad = 30;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void hablar() {
		saludar();
		System.out.println("Mi profesion es " + getProfesion()+ " tengo de edad "+getEdad());
		caminar();
		comer();
		System.out.println("---------------------------------------------");
	}
	
	public void caminar() {
		System.out.println("Puedo caminar");
	}
	
	public void saludar() {
		System.out.println("Saludos!!");
	}
	
	public void comer() {
		System.out.println("Puedo comer");
	}

}
