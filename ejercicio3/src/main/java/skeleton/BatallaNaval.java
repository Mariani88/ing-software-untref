package skeleton;

public class BatallaNaval {

	private Tablero tableroJugador;

	public BatallaNaval() {

		this.tableroJugador = new Tablero();
	}

	public String jugadorUnoAgrega(Barco barco, int fila, int columna, Orientacion orientacion) {

		String mensaje = null;

		boolean zonaValida = this.tableroJugador.entraEnZonaValida(barco, fila, columna, orientacion);

		if (zonaValida) {
			boolean agregado = this.tableroJugador.agregar(barco, fila, columna, orientacion);
			mensaje = deducirMensaje(agregado);
		} else {
			mensaje = "posicion invalida para ubicar barco";
		}

		return mensaje;
	}

	private String deducirMensaje(boolean agregado) {
		String mensaje;
		if (agregado) {
			mensaje = "barco agregado";
		} else {
			mensaje = "posicion ocupada";
		}
		return mensaje;
	}
}