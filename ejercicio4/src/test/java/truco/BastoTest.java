package truco;

import org.junit.Assert;
import org.junit.Test;

public class BastoTest {

	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaUnaCarta (){
		
		Palo basto = new Basto ();
		int aporteDeCarta1 = 7;
		int envidoEsperado = aporteDeCarta1;
		
		int envidoAcumulado = basto.acumularEnvido ( aporteDeCarta1 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartas (){
		
		Palo basto = new Basto ();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6; 
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;
		
		int envidoAcumulado = basto.acumularEnvido ( aporteDeCarta1 );
		envidoAcumulado = basto.acumularEnvido ( aporteDeCarta2 );
		
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
}
