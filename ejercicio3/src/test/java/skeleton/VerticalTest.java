package skeleton;

import org.junit.Assert;
import org.junit.Test;



public class VerticalTest {

	
	

	@Test
	public void ubicarBarcoDebeColocarBarcoEnTableroVerticalmente (){
		
		int fila = 0;
		int columna = 0;
		
		Barco [][] matrizTablero = new Barco [4][4]; 
		this.inicializarMatrizTablero (matrizTablero);
		Barco destructor = new Destructor ();
		
		Orientacion vertical = new Vertical ();
		
		vertical.ubica (destructor, matrizTablero, fila, columna);
		
		Assert.assertEquals(destructor, matrizTablero[0][0]);
		Assert.assertEquals(destructor, matrizTablero[1][0]);
		Assert.assertEquals(destructor, matrizTablero[2][0]);
	}

	private void inicializarMatrizTablero(Barco[][] matrizTablero) {
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){		
				matrizTablero [i][j] = null;
			}
		}
	}
}