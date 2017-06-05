package com.bdd.springcucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Aeonitis
 *         Scenario steps for feature 'RestaurantService'
 */
public class CucumberRestaurantTestSteps extends StepsDefinition {

    @Given("the client is in the expected location")
    public void clientIsInCorrectURL() {
    }

    @When("the host sees the client")
    public void clientGetHost() {
    }

    @Then("the client receives greeting")
    public void greetClient() {
    }

    @When("the client sits")
    public void clientSit() {
    }

    @Then("the menu is presented")
    public void clientGetMenu() {
    }

    @Then("the client receives status code of 200")
    public void clientStatus200() {
    }

}
