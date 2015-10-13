package skeleton;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsAgregarBarco {

	private BatallaNaval batalla = new BatallaNaval();
	private String mensaje;

	@Given("^jugador tiene un barco en la posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void jugador_tiene_un_barco_en_la_posicion_HORIZONTALMENTE(int fila, int columna) throws Throwable {
		this.batalla.jugadorUnoAgrega(new Destructor(), fila, columna, new Horizontal());
	}

	@When("^jugador agrega un destructor en posicion (\\d+) (\\d+) VERTICALMENTE$")
	public void jugador_agrega_un_destructor_en_posicion_VERTICALMENTE(int fila, int columna) throws Throwable {
		this.mensaje = this.batalla.jugadorUnoAgrega(new Destructor(), fila, columna, new Vertical());
	}

	@Then("^jugador obtiene \"(.*?)\"$")
	public void jugador_obtiene(String mensaje) throws Throwable {

		Assert.assertEquals(mensaje, this.mensaje);
	}

	@When("^jugador agrega un destructor en posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void jugador_agrega_un_destructor_en_posicion_HORIZONTALMENTE(int fila, int columna) throws Throwable {

		this.mensaje = this.batalla.jugadorUnoAgrega(new Destructor(), fila, columna, new Horizontal());

	}
}