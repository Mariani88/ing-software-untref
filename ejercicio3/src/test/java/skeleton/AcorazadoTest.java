package skeleton;

import org.junit.Assert;
import org.junit.Test;



public class AcorazadoTest {

	@Test
	public void reducirVidaDebeReducirlaEnUno (){
		Barco acorazado = new Acorazado ();
		
		acorazado.reducirVida();
		Assert.assertEquals(1, acorazado.getVida());
	}
}
