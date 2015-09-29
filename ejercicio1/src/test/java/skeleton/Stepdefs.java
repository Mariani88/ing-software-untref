package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.java.en.Then;

public class Stepdefs {
	
    private Calculator calculator = null;
    private int result;
	
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int arg1) throws Throwable {
        
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        this.calculator = new Calculator ();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        this.result = this.calculator.add ( arg1, arg2); 
    }

    @Then("^My the result is (\\d+)$")
    public void my_the_result_is(int arg1) throws Throwable {
   
        if (this.result != arg1 ){
            throw new Exception();
        }
    }
    
    //******************************************************
  



}
