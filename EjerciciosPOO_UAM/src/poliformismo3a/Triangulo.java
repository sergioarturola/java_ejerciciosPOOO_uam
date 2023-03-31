package poliformismo3a;

public class Triangulo extends Figura {
	
	private double base, ladoDos, ladoTres;
	private char tipo;
	
	public Triangulo(double base, double ladoDos, double ladoTres) {
		this.base = base;
		this.ladoDos = ladoDos;
		this.ladoTres = ladoTres;
		
		//comprobando que tipo de triangulo es
		
		if((this.base == this.ladoDos) && (this.base == this.ladoDos) && (this.ladoDos == this.ladoTres)&& 
				(this.base == this.ladoTres)) {
			System.out.println("Triangulo Equilatero");
			tipo = 'e';
		}
		
		else if(this.ladoDos == this.ladoTres){
			System.out.println("Triangulo Isoceles");
			tipo = 'i';
		}
		else {
			System.out.println("Triangulo Escaleno");
			tipo = 'k';
		}
	}

	@Override
	public void perimetro() {
		double resultado = 0;
		
		switch (tipo){
		   
		case 'e':
			resultado = 3*base;
			break;
		case 'i':
			resultado = 2*ladoDos + base;
			break;
		case 'k':
			resultado = base + ladoDos + ladoTres;
			break;	
			
		}
		
		System.out.println("El perimetro del triangulo es: "+resultado);
		
		
	}

	@Override
	public void area() {
		
		double ar = 0;
		
		if(tipo == 'e') {
			ar = ((Math.sqrt(3))/4)*(base*base);
			System.out.println("si paso por e");
			
		}
		else {
			
			ar = (base*ladoDos)/2;
			
		}
		
		System.out.println("El area del triangulo es: "+ar);
		
		
	}
	
	

}
