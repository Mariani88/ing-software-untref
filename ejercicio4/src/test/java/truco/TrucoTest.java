package truco;

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TrucoTest {

	private List <Carta> cartas = new LinkedList <Carta> ();
	private int resultadoEnvido = 0;
	
	@Given("^el jugador tiene (\\d+) de copa, (\\d+) de espada y (\\d+) de oro$")
	public void el_jugador_tiene_de_copa_de_espada_y_de_oro(int numero1, int numero2, int numero3) throws Throwable {
		
		this.cartas.add(new Carta (numero1, new Copa ()) );
		this.cartas.add(new Carta (numero2, new Espada ()) );
		this.cartas.add(new Carta (numero3, new Oro ()) );
		
	}

	@When("^el jugador canta envido$")
	public void el_jugador_canta_envido() throws Throwable {
	    
		Truco truco = new Truco ();
		this.resultadoEnvido = truco.obtenerEnvidoDe (this.cartas);	
	}

	/*@Then("^el envido es (\\d+)$")
	public void el_envido_es(int envido) throws Throwable {
		
	   Assert.assertEquals( envido, this.resultadoEnvido);
	}*/
}