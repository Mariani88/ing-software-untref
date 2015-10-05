package skeleton;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	private Ahorcado ahorcado;
	
	@Given("^la palabra secreta es \"(.*?)\"$")
	public void la_palabra_secreta_es(String palabra) throws Throwable {
		
		this.ahorcado = new Ahorcado (palabra);
	}
	
	@Given("^me quedan (\\d+) vida$")
	public void me_quedan_vida(int vidas) throws Throwable {
	    
		this.ahorcado.setVidas (vidas);
	}


	@When("^arriesgo \"(.*?)\"$")
	public void arriesgo(String letra) throws Throwable {
		this.ahorcado.arriesgar (letra);
	}

	@Then("^estado es \"(.*?)\"$")
	public void estado_es(String estado) throws Throwable {
		Assert.assertEquals(estado, this.ahorcado.estado());
	}

	@Then("^me quedan (\\d+) vidas$")
	public void me_quedan_vidas(int vidas) throws Throwable {
	    Assert.assertEquals(vidas, this.ahorcado.vidas());
	}

	@Then("^resultado \"(.*?)\"$")
	public void resultado (String resultado) throws Throwable {
		Assert.assertEquals ( resultado, this.ahorcado.estadoJugador() );
	}





	
	

}