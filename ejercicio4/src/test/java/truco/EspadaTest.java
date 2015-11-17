package truco;

import org.junit.Assert;
import org.junit.Test;



public class EspadaTest {
	
	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaEspada (){
		
		Espada espada = new Espada ();
		int numeroDeCarta1 = 7;
		int envidoEsperado = numeroDeCarta1;
		
		int envidoAcumulado = espada.acumularEnvido ( numeroDeCarta1 );
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
		
		
	}
}
