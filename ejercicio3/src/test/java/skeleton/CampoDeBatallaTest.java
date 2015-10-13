package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class CampoDeBatallaTest {

	@Test
	public void construirCampoDebeInicializarANullLasPosicionesDelTablero() {

		CampoDeBatalla campo = new CampoDeBatalla();
		Barco[][] matrizTablero = new Barco[2][2];
		campo.construirLugarDeCombate(matrizTablero);

		Assert.assertNull(matrizTablero[0][0]);
		Assert.assertNull(matrizTablero[0][1]);
		Assert.assertNull(matrizTablero[1][0]);
		Assert.assertNull(matrizTablero[1][1]);
	}
}