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

		boolean puedeAgregarse = orientacion.zonaDisponiblePara(barco, this.matrizTablero, fila, columna);

		if (puedeAgregarse) {
			orientacion.ubica(barco, this.matrizTablero, fila, columna);
			agregado = true;
		}

		return agregado;
	}

	public boolean entraEnZonaValida(Barco barco, int fila, int columna, Orientacion orientacion) {

		return orientacion.validarZonaDeUbicacionPara(barco, this.matrizTablero, fila, columna);
	}

}
