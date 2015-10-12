package skeleton;

public abstract class Orientacion {

	public abstract void ubica(Barco barco, Barco[][] matrizTablero, int fila, int columna);

	public abstract boolean zonaDisponiblePara(Barco barco, Barco[][] matrizTablero, int fila, int columna);

	public abstract boolean validarZonaDeUbicacionPara(Barco barco, Barco[][] matrizTablero, int fila, int columna);
}
