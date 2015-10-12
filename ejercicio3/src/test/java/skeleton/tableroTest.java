package skeleton;

import org.junit.Assert;
import org.junit.Test;



public class tableroTest {

	@Test
	public void agregarDebeDevolverTrueSiAgregaBarco(){
		
		Tablero tablero = new Tablero ();
		
		boolean agregado = tablero.agregar(new Destructor (), 0, 0, new Vertical ());
		Assert.assertTrue(agregado);
	}
	
	@Test
	public void agregarNoDebeAgregarBarcoSiPosicionIngresadaEstaOcupada (){
		
		Tablero tablero = new Tablero ();
		tablero.agregar(new Destructor (), 0, 2, new Horizontal ());
		
		boolean agregado = tablero.agregar(new Destructor (), 0, 2, new Horizontal ());
		
		Assert.assertFalse(agregado);
	}
	
	
	@Test
	public void agregarNoDebeAgregarBarcoSiPosicionIngresadaEstaMuyCercanaAOcupada (){
		
		Tablero tablero = new Tablero ();
		tablero.agregar(new Destructor (), 0, 2, new Horizontal ());
		
		boolean agregado = tablero.agregar(new Destructor (), 0, 0, new Horizontal ());
		
		Assert.assertFalse(agregado);
	}
	
	
	@Test
	public void agregarNoDebeAgregarBarcoVerticalmenteSiPosicionIngresadaEstaMuyCercanaAOcupada (){
		
		Tablero tablero = new Tablero ();
		tablero.agregar(new Destructor (), 2, 0, new Vertical ());
		
		boolean agregado = tablero.agregar(new Destructor (), 0, 0, new Vertical ());
		
		Assert.assertFalse(agregado);
	}
	
	
	@Test
	public void entraEnZonaValidaDebeDevolverSiUnBarcoEntraEnTablero (){
		
		Tablero tablero = new Tablero ();
		int fila = 9;
		int columna = 0;
		boolean entra = tablero.entraEnZonaValida(new Destructor (), fila, columna, new Vertical ());
		Assert.assertFalse(entra);
		
		entra = tablero.entraEnZonaValida(new Destructor (), fila, columna, new Horizontal ());
		Assert.assertTrue(entra);
	}
	
	
	
	
}