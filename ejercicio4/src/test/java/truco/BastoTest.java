package truco;

import org.junit.Assert;
import org.junit.Test;

public class BastoTest {

	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaUnaCarta (){
		
		Palo espada = new Basto ();
		int aporteDeCarta1 = 7;
		int envidoEsperado = aporteDeCarta1;
		
		int envidoAcumulado = espada.acumularEnvido ( aporteDeCarta1 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
}
