package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import cucumber.api.java.en.Then;

public class StepdefsEjercicio1 {
	  
	private String ganador;
	private Juego juego;
	private Jugador jugador1;
	private Jugador jugador2;
	
	
    @Given("^jugador(\\d+) juega PIEDRA$")
    public void jugador_juega_PIEDRA(int numeroDeJugador) throws Throwable {
    	this.ganador = "gana jugador"+ String.valueOf(numeroDeJugador);
    	this.jugador1 = new Jugador (numeroDeJugador);
    	this.jugador1.juegaPiedra();
    }

    @When("^jugador(\\d+) juega TIJERA$")
    public void jugador_juega_TIJERA(int numeroDeJugador) throws Throwable {
    	this.jugador2 = new Jugador (numeroDeJugador);
    	this.jugador2.juegaTijera();
        
    }

    @Then("^gana jugador(\\d+)$")
    public void gana_jugador(int numeroDeJugador) throws Throwable {
    	
    	this.juego = new Juego (this.jugador1, this.jugador2);
        Assert.assertEquals( this.ganador, this.juego.definirGanador () );
    }
}
