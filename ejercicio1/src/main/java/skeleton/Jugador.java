package skeleton;

public class Jugador {
	
	private Opcion opcionElegida;
	private int numeroDeJugador;
	
	
	public Jugador(int numeroDeJugador) {
		this.numeroDeJugador = numeroDeJugador;
	}

	public void juegaPiedra() {
		this.opcionElegida = new Piedra();
		
	}

	public void juegaTijera() {
		this.opcionElegida = new Tijera ();
	}
	
	public void juegaPapel() {
		this.opcionElegida = new Papel ();
	}
	

	public int getNumeroDeJugador (){
		return this.numeroDeJugador;
	}
	
	public Opcion getOpcionElegida (){
		
		return this.opcionElegida;
		
	}
}
