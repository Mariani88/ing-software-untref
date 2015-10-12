package skeleton;

public class BatallaNaval {

	private Tablero tableroJugador;
	private Tablero tableroAdversario;
	
	public BatallaNaval (){
		
		this.tableroJugador = new Tablero ();
		this.tableroAdversario = new Tablero ();
		
		
	}
	
	
	public String jugadorUnoAgrega(Barco barco, int fila, int columna, Orientacion orientacion){
		
		String mensaje = null;
		
		boolean agregado = this.tableroJugador.agregar (barco, fila, columna, orientacion);
		
		if (agregado){
			mensaje = "barco agregado";
		}
		
		return mensaje;
	}
}