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
    
    	if (this.jugador1 == null){
    		this.jugador1 = new Jugador (numeroDeJugador);
        	this.jugador1.juegaPiedra();
    	}else {
    		this.jugador2 = new Jugador (numeroDeJugador);
        	this.jugador2.juegaPiedra();
    	}    	
    }

    @When("^jugador(\\d+) juega TIJERA$")
    public void jugador_juega_TIJERA(int numeroDeJugador) throws Throwable {
    	
    	if (this.jugador1 == null){
    		this.jugador1 = new Jugador (numeroDeJugador);
        	this.jugador1.juegaTijera(); 
    	}else{
    		this.jugador2 = new Jugador (numeroDeJugador);
        	this.jugador2.juegaTijera();   
    	}
    }
    
    @Given("^jugador(\\d+) juega PAPEL$")
    public void jugador1_juega_PAPEL(int numeroDeJugador) throws Throwable {
    	if (this.jugador1 == null){
    		this.jugador1 = new Jugador (numeroDeJugador);
        	this.jugador1.juegaPapel(); 
    	}else{
    		this.jugador2 = new Jugador (numeroDeJugador);
        	this.jugador2.juegaPapel();   
    	}
    }

    @Then("^empate$")
    public void empate() throws Throwable {
    	this.ganador = "empate";
    	this.juego = new Juego (this.jugador1, this.jugador2);
        Assert.assertEquals( this.ganador, this.juego.definirGanador () );
    }

    @Then("^gana jugador(\\d+)$")
    public void gana_jugador(int numeroDeJugador) throws Throwable {
    	this.ganador = "gana jugador"+ String.valueOf(numeroDeJugador);
    	this.juego = new Juego (this.jugador1, this.jugador2);
        Assert.assertEquals( this.ganador, this.juego.definirGanador () );
    }
}