package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class HorizontalTest {

	private Orientacion horizontal = new Horizontal ();
	private Barco [][] matrizTablero = new Barco [4][4]; 
	private CampoDeBatalla campo = new CampoDeBatalla ();
	
	@Test
	public void ubicarBarcoDebeColocarDestructorEnTableroHorizontalmente (){
		int fila = 0;
		int columna = 0;	
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco destructor = new Destructor ();
		
		this.horizontal.ubica (destructor, this.matrizTablero, fila, columna);
		
		Assert.assertEquals(destructor, this.matrizTablero[0][0]);
		Assert.assertEquals(destructor, this.matrizTablero[0][1]);
		Assert.assertEquals(destructor, this.matrizTablero[0][2]);
		this.assertarNullDesde (0,3);
	}
	
	
	
	
	private void assertarNullDesde(int fila, int columna) {
		
		for (int j = columna; j < this.matrizTablero[fila].length; j++ ){
			Assert.assertNull(this.matrizTablero[fila][j]);
		}
		
		for (int i = fila + 1; i < this.matrizTablero.length; i++){
			for (int j = 0; j < this.matrizTablero [i].length; j++){
				Assert.assertNull(this.matrizTablero[i][j]);
			}
		}
	}	
}