package com.bdd.springcucumber.runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/**
 * @author Aeonitis
 * Empty class for running cucumber test scenarios
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"com.bdd.springcucumber.steps"})
public class CucumberRestaurantTestRunner {
}