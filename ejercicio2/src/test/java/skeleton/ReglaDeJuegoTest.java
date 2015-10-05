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
	
	@Test
	public void jugadorConCeroVidasDebeEstarAhorcado (){
		
		ReglaDeAhorcado regla = new ReglaDeAhorcado ("balanza");
		int vidas = 0;
		Assert.assertEquals("ahorcado", regla.obtenerCondicionDelJugador (vidas) );
	}
	
	@Test
	public void jugadorDebeGanarSiAcierta (){
		
		ReglaDeAhorcado regla = new ReglaDeAhorcado ("balanza");
		String estado = "balanza";
		regla.setEstadoJugador(estado);
		int vidas = 1;
		Assert.assertEquals("ganaste", regla.obtenerCondicionDelJugador (vidas) );
	}
}