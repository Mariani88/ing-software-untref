package truco;

import org.junit.Assert;
import org.junit.Test;

public class EspadaTest {

	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaUnaCarta() {

		Palo espada = new Espada();
		int aporteDeCarta1 = 7;
		int envidoEsperado = aporteDeCarta1;

		int envidoAcumulado = espada.acumularEnvido(aporteDeCarta1);
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}

	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartas() {

		Palo espada = new Espada();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6;
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;

		int envidoAcumulado = espada.acumularEnvido(aporteDeCarta1);
		envidoAcumulado = espada.acumularEnvido(aporteDeCarta2);

		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}

	@Test
	public void envidoAcumuladoDebeDevolverEnvidoAcumuladoParaDosCartasMasGrandesDeTres() {

		Palo espada = new Espada();
		int aporteDeCarta1 = 7;
		int aporteDeCarta2 = 6;
		int aporteDeCarta3 = 5;
		int envidoEsperado = aporteDeCarta1 + aporteDeCarta2 + 20;

		int envidoAcumulado = espada.acumularEnvido(aporteDeCarta1);
		envidoAcumulado = espada.acumularEnvido(aporteDeCarta2);
		envidoAcumulado = espada.acumularEnvido(aporteDeCarta3);
		Assert.assertEquals(envidoEsperado, envidoAcumulado);
	}

}