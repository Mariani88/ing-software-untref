package truco;

import org.junit.Assert;
import org.junit.Test;



public class CartaTest {

	@Test
	public void cartaConNumeroMenorADiezAportaAEnvidoSuNumeroDeCarta (){
		
		Carta carta = new Carta (7, new Espada ());
		
		Assert.assertEquals(7, carta.getAporteAEnvido () );
	}
	
	
}
