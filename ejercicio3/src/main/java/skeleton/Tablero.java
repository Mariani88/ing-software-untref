package skeleton;

public class Tablero {

	private final int largo = 10;
	private final int ancho = 10;
	private Barco[][] matrizTablero = new Barco[this.ancho][this.largo];
	private CampoDeBatalla campo = new CampoDeBatalla();

	public Tablero() {
		this.campo.construirLugarDeCombate(this.matrizTablero);

	}

	public boolean agregar(Barco barco, int fila, int columna, Orientacion orientacion) {

		boolean agregado = false;

		boolean zonaLibre = orientacion.zonaDisponiblePara(barco, this.matrizTablero, fila, columna);

		if (zonaLibre) {
			orientacion.ubica(barco, this.matrizTablero, fila, columna);
			agregado = true;
		}

		return agregado;
	}

	public boolean entraEnZonaValida(Barco barco, int fila, int columna, Orientacion orientacion) {

		return orientacion.validarZonaDeUbicacionPara(barco, this.matrizTablero, fila, columna);
	}

	public String buscarBlancoEn(int fila, int columna) {
		
		String mensaje = "posicion invalida";
		boolean posicionValida = this.validarPosicionDeTiro(fila, columna, mensaje);

		if (posicionValida) {
			mensaje = buscarObjetivo(fila, columna);
		}

		return mensaje;
	}

	private String buscarObjetivo(int fila, int columna) {
	
		String mensaje;
		if (this.matrizTablero[fila][columna] == null) {
			mensaje = "toco agua";
		} else {
			mensaje = daniarBarco(fila, columna);
		}
		
		return mensaje;
	}

	private boolean validarPosicionDeTiro(int fila, int columna, String mensaje) {

		boolean filaValida = fila < this.matrizTablero.length;
		boolean columnaValida = false;
		
		if (filaValida){
			columnaValida = columna < this.matrizTablero[fila].length;
		}

		return filaValida && columnaValida;
	}

	private String daniarBarco(int fila, int columna) {
		
		String mensaje = "barco averiado";
		Barco barco = this.matrizTablero[fila][columna];
		barco.reducirVida();
		this.matrizTablero[fila][columna] = null;

		if (barco.getVida() == 0) {
			mensaje = "barco hundido";
		}
		
		return mensaje;
	}
}