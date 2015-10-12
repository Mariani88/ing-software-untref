package skeleton;

public class Tablero {

	private final int largo = 10;
	private final int ancho = 10;
	private Barco [][] matrizTablero = new Barco [this.ancho][this.largo];
	
	
	public Tablero (){
		
		for ( int i = 0; i < this.ancho; i++){
			for ( int j = 0; j < this.largo; j++){
				this.matrizTablero[i][j] = null;
			}
		}
	}
	
	public boolean agregar(Barco barco, int fila, int columna, Orientacion orientacion) {
	
		boolean agregado = false;
		
		orientacion.ubica(barco, this.matrizTablero, fila, columna);
		agregado = true;
		
		return agregado;
	}

}
