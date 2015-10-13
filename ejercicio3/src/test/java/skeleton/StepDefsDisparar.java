package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsDisparar {

	private String mensajePostDisparo = null;
	private BatallaNaval batalla = new BatallaNaval();

	@Given("^jugador tiene un destructor en la posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void jugador_tiene_un_destructor_en_la_posicion_HORIZONTALMENTE(int fila, int columna) throws Throwable {

		this.batalla.jugadorDosAgrega(new Destructor(), fila, columna, new Horizontal());
	}

	@Given("^jugador tiene un destructor en la posicion (\\d+) (\\d+) VERTICALMENTE$")
	public void jugador_tiene_un_destructor_en_la_posicion_VERTICALMENTE(int fila, int columna) throws Throwable {

		this.batalla.jugadorDosAgrega(new Destructor(), fila, columna, new Vertical());
	}

	@Given("^jugador tiene un acorazado en la posicion (\\d+) (\\d+) HORIZONTALMENTE$")
	public void jugador_tiene_un_acorazado_en_la_posicion_HORIZONTALMENTE(int fila, int columna) throws Throwable {

		this.batalla.jugadorDosAgrega(new Acorazado(), fila, columna, new Horizontal());
	}

	@When("^jugador dispara a la posicion (\\d+) (\\d+)$")
	public void jugador_dispara_a_la_posicion(int fila, int columna) throws Throwable {

		this.mensajePostDisparo = this.batalla.atacarAJugadorDosEn(fila, columna);
	}

	@Then("^jugador luego de disparar obtiene \"(.*?)\"$")
	public void jugador_luego_de_disparar_obtiene(String mensaje) throws Throwable {

		Assert.assertEquals(mensaje, this.mensajePostDisparo);
	}
}