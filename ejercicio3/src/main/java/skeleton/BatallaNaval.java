package skeleton;

public class BatallaNaval {

	private Tablero tableroJugador;
	private Tablero tableroJugadorDos;

	public BatallaNaval() {

		this.tableroJugador = new Tablero();
		this.tableroJugadorDos = new Tablero();
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

	public String jugadorDosAgrega(Barco barco, int fila, int columna, Orientacion orientacion) {

		String mensaje = null;

		boolean zonaValida = this.tableroJugadorDos.entraEnZonaValida(barco, fila, columna, orientacion);

		if (zonaValida) {
			boolean agregado = this.tableroJugadorDos.agregar(barco, fila, columna, orientacion);
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

	public String atacarAJugadorDosEn(int fila, int columna) {

		return this.tableroJugadorDos.buscarBlancoEn(fila, columna);
	}
}