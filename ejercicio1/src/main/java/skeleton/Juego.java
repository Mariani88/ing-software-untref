package skeleton;

public class Juego {

	private Jugador jugador1;
	private Jugador jugador2;
	
	
	public Juego(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public String definirGanador() {
		
		String resultado = "empate";

		if (this.jugador1.getOpcionElegida().leGanaA(
				this.jugador2.getOpcionElegida())) {

			resultado = "gana jugador" + String.valueOf(
					this.jugador1.getNumeroDeJugador());
			
		}else if (this.jugador2.getOpcionElegida().leGanaA(
				this.jugador1.getOpcionElegida())){
			resultado = "gana jugador" + String.valueOf(
					this.jugador2.getNumeroDeJugador());
		}

		return resultado;
	}
}