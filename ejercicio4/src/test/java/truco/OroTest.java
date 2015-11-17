package truco;

import org.junit.Assert;
import org.junit.Test;

public class OroTest {

	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaUnaCarta (){
		
		Palo oro = new Oro ();
		int aporteDeCarta1 = 7;
		int envidoEsperado = aporteDeCarta1;
		
		int envidoAcumulado = oro.acumularEnvido ( aporteDeCarta1 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartas (){
		
		Palo oro = new Oro ();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6; 
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;
		
		int envidoAcumulado = oro.acumularEnvido ( aporteDeCarta1 );
		envidoAcumulado = oro.acumularEnvido ( aporteDeCarta2 );
		
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartasMasGrandesDeTres (){
		
		Palo oro = new Oro ();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6; 
		int aporteDeCarta3 = 5;
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;
		
		int envidoAcumulado = oro.acumularEnvido ( aporteDeCarta1 );
		envidoAcumulado = oro.acumularEnvido ( aporteDeCarta2 );
		envidoAcumulado = oro.acumularEnvido ( aporteDeCarta3 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}	
}