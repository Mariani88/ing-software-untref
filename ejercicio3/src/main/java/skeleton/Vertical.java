package skeleton;

public class Vertical extends Orientacion {

	@Override
	public void ubica(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		int tamanio = barco.getTamanio();
		
		for ( int i = fila; i < tamanio; i++){
			matrizTablero [i][columna] = barco;
		}
	}
}
