package skeleton;

public class Horizontal extends Orientacion{

	@Override
	public void ubica(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		for ( int j = columna; j < barco.getTamanio(); j++ ){
			
			matrizTablero [fila][j] = barco;
		}	
	}
}