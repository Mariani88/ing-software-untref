package skeleton;

import org.junit.Assert;
import org.junit.Test;


public class ReglaDeJuegoTest {
	
	@Test
	public void aplicarReglaAlArriesgarLetraCorrecta (){
		
		String palabra = "balanza";
		ReglaDeAhorcado regla = new ReglaDeAhorcado (palabra);
		Assert.assertEquals("*a*a**a", regla.aplicarAPalabra ("a") );
	}

	
	
	
}