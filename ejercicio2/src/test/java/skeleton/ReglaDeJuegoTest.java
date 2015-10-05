package skeleton;

import org.junit.Assert;
import org.junit.Test;


public class ReglaDeJuegoTest {
	
	@Test
	public void aplicarReglaAlEstadoAlArriesgarLetraCorrecta (){
		
		String palabra = "balanza";
		ReglaDeAhorcado regla = new ReglaDeAhorcado (palabra);
		Assert.assertEquals("*a*a**a", regla.aplicarAPalabra ("a") );
	}
	
	@Test
	public void aplicarReglaAlEstadoAlArriesgarLetraCorrectaEnMayuscula (){
		
		String palabra = "balanza";
		ReglaDeAhorcado regla = new ReglaDeAhorcado (palabra);
		Assert.assertEquals("*a*a**a", regla.aplicarAPalabra ("A") );
	}
	
	
	@Test
	public void aplicarReglaAlEstadoAlArriesgarLetraErronea (){
		
		String palabra = "balanza";
		ReglaDeAhorcado regla = new ReglaDeAhorcado (palabra);
		Assert.assertEquals("*******", regla.aplicarAPalabra ("w") );
	}
	
	
	
	
}