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
}