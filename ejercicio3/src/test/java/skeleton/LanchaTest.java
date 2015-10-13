package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class LanchaTest {

	@Test
	public void reducirVidaDebeReducirlaEnUno() {
		Barco lancha = new Lancha();

		lancha.reducirVida();
		Assert.assertEquals(0, lancha.getVida());
	}
}
