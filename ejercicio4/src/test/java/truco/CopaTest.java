package truco;

import org.junit.Assert;
import org.junit.Test;

public class CopaTest {

	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaUnaCarta (){
		
		Palo copa = new Copa ();
		int aporteDeCarta1 = 7;
		int envidoEsperado = aporteDeCarta1;
		
		int envidoAcumulado = copa.acumularEnvido ( aporteDeCarta1 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartas (){
		
		Palo copa = new Copa ();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6; 
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;
		
		int envidoAcumulado = copa.acumularEnvido ( aporteDeCarta1 );
		envidoAcumulado = copa.acumularEnvido ( aporteDeCarta2 );
		
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartasMasGrandesDeTres (){
		
		Palo copa = new Copa ();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6; 
		int aporteDeCarta3 = 5;
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;
		
		int envidoAcumulado = copa.acumularEnvido ( aporteDeCarta1 );
		envidoAcumulado = copa.acumularEnvido ( aporteDeCarta2 );
		envidoAcumulado = copa.acumularEnvido ( aporteDeCarta3 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}
	
	
}
