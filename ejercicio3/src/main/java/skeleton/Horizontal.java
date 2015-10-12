package skeleton;

public class Horizontal extends Orientacion{

	@Override
	public void ubica(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		for ( int j = columna; j < barco.getTamanio(); j++ ){
			
			matrizTablero [fila][j] = barco;
		}	
	}

	@Override
	public boolean zonaDisponiblePara(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		boolean disponible = true;
		int i = 0;
		
		while (disponible && i < barco.getTamanio() ){
			
			disponible = matrizTablero [fila][columna + i] == null;
			i++;
		}
		
		return disponible;
	}

	@Override
	public boolean validarZonaDeUbicacionPara(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		boolean zonaValida = fila < matrizTablero.length;
		int i = 0;
		
		while (zonaValida && i < barco.getTamanio()){
			
			zonaValida = (columna + i) < matrizTablero[fila].length;
			i++;
		}
		
		return zonaValida;
	}
}