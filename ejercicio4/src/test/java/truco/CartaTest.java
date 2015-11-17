package truco;

import org.junit.Assert;
import org.junit.Test;

public class CartaTest {

	@Test
	public void cartaConNumeroMenorADiezAportaAEnvidoSuNumeroDeCarta() {

		Carta carta = new Carta(7, new Espada());
		Assert.assertEquals(7, carta.getAporteAEnvido());
	}

	@Test
	public void cartaConNumeroMayorASieteAportaAEnvidoCero() {

		Carta carta = new Carta(10, new Espada());
		Assert.assertEquals(0, carta.getAporteAEnvido());
	}

	@Test
	public void contribuirAEnvidoDebeSumarAlEnvido() {

		Palo espada = new Espada();

		Carta carta1 = new Carta(10, espada);
		Carta carta2 = new Carta(7, espada);

		int envido = carta1.contribuirAlEnvido();
		envido = carta2.contribuirAlEnvido();

		Assert.assertEquals(27, envido);
	}
}