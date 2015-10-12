package skeleton;

public class Vertical extends Orientacion {

	@Override
	public void ubica(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		int tamanio = barco.getTamanio();
		
		for ( int i = fila; i < tamanio; i++){
			matrizTablero [i][columna] = barco;
		}
	}

	@Override
	public boolean zonaDisponiblePara(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
		
		boolean disponible = true;
		int i = 0;
		
		while (disponible && i < barco.getTamanio() ){
			
			disponible = matrizTablero [fila + i][columna] == null;
			i++;
		}
		
		return disponible;
	}

	@Override
	public boolean validarZonaDeUbicacionPara(Barco barco, Barco[][] matrizTablero, int fila, int columna) {
	
		boolean zonaValida = columna < matrizTablero[fila].length;
		int i = 0;
		
		while (zonaValida && i < barco.getTamanio()){
			
			zonaValida = fila + i < matrizTablero.length; 
			i++;
		}
		
		return zonaValida;
	}
}