package herencia1;


public class Main {

	public static void main(String[] args) {
		MaestroMatematicas mate = new MaestroMatematicas();
		mate.enseñarMatematicas();
		mate.hablar();
		
		JugadorFutbol jugador = new JugadorFutbol();
		jugador.setEdad(19);
		jugador.setProfesion("futbolista");
		jugador.jugarFutbol();
		jugador.hablar();
		
		HombreNegocios negocios = new HombreNegocios();
		negocios.setProfesion("gerente de proyecto");
		negocios.hacerNegocios();
		negocios.hablar();

	}

}
