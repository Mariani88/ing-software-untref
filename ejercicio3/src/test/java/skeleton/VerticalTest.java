package skeleton;

import org.junit.Assert;
import org.junit.Test;



public class VerticalTest {

	
	private Orientacion vertical = new Vertical ();
	private Barco [][] matrizTablero = new Barco [4][4]; 
	private CampoDeBatalla campo = new CampoDeBatalla ();
	
	@Test
	public void ubicarBarcoDebeColocarDestructorEnTableroVerticalmente (){
		
		int fila = 0;
		int columna = 0;	
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco destructor = new Destructor ();
		
		this.vertical.ubica (destructor, this.matrizTablero, fila, columna);
		
		Assert.assertEquals(destructor, this.matrizTablero[0][0]);
		Assert.assertEquals(destructor, this.matrizTablero[1][0]);
		Assert.assertEquals(destructor, this.matrizTablero[2][0]);
		this.assertarNullDesde (3,0);
	}
	

	@Test
	public void ubicarBarcoDebeUbicarLanchaVerticalmente (){
		
		int fila = 0;
		int columna = 0;	
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco lancha = new Lancha ();
		
		this.vertical.ubica (lancha, this.matrizTablero, fila, columna);
		
		Assert.assertEquals(lancha, this.matrizTablero[0][0]);
		this.assertarNullDesde(1, 0);
	}
	
	@Test
	public void ubicarBarcoDebeUbicarAcorazadoVerticalmente (){
		
		int fila = 0;
		int columna = 0;	
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco acorazado = new Acorazado ();
		
		this.vertical.ubica (acorazado, this.matrizTablero, fila, columna);
		
		Assert.assertEquals(acorazado, this.matrizTablero[0][0]);
		Assert.assertEquals(acorazado, this.matrizTablero[1][0]);
		this.assertarNullDesde(2, 0);
	}
	
	private void assertarNullDesde(int fila, int columna) {
		
		for ( int i = fila; i < this.matrizTablero[fila].length; i++){
			Assert.assertNull(this.matrizTablero[i][columna]);
		}
		
		for (int j = columna; j < this.matrizTablero[fila].length ;j++){
			for (int i = fila; i < this.matrizTablero.length; i++){
				Assert.assertNull(this.matrizTablero[i][j]);
			}
		}
	}

}