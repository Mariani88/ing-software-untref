package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class DestructorTest {

	@Test
	public void reducirVidaDebeReducirlaEnUno() {
		Barco destructor = new Destructor();

		destructor.reducirVida();
		Assert.assertEquals(2, destructor.getVida());
	}

}
