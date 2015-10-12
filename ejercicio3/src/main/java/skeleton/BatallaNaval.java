package skeleton;

public class BatallaNaval {

	private Tablero tableroJugador;

	
	public BatallaNaval (){
		
		this.tableroJugador = new Tablero ();
	}
	
	
	public String jugadorUnoAgrega(Barco barco, int fila, int columna, Orientacion orientacion){
		
		String mensaje = null;
		
		boolean agregado = this.tableroJugador.agregar (barco, fila, columna, orientacion);
		
		if (agregado){
			mensaje = "barco agregado";
		}else{
			mensaje = "posicion ocupada";
		}
		
		return mensaje;
	}
}