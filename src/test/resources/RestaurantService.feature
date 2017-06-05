# This is a Cucumber Feature file consisting of Gherkin Language

# Feature: Defines what feature of app/restaurant you will be testing in the tests below
# Background: Adds some context to the scenarios in a single feature. A Background is much like a scenario containing a number of steps.
      #The difference is when it is run. The background is run before each of your scenarios but after any of your Before Hooks.
# Given: Puts the system in a known state before the user (or external system) starts interacting with the system (in the When steps).
      #Avoid talking about user interaction in givens. If you were creating use cases, givens would be your preconditions
# When: Describes the key action the user performs (or, using Robert C. Martin’s metaphor, the state transition).
# Then: Observe outcomes. States the post condition/expected result of the test
      #The observations should be related to the business value/benefit in your feature description
      #i.e. some kind of output (report, user interface, message) and not something that is deeply buried inside it (that has no business value).
# And/But: Defines additional conditions of the test
# Scenario Outlines/Examples: Express examples through the use of a template with placeholders, using Scenario Outline, Examples with tables and < > delimited parameters

#TODO: Background, Scenario Outline/Examples, Hooks
Feature: Testing the Restaurant as a Service

  #GET /host/lookup
  Scenario: Host greets Client
    Given the client is in the expected location
    When the host sees the client
    Then the client receives greeting

  #GET /waiter/menu
  Scenario: Waiter presents Menu
    Given the client is in the expected location
    When the client sits
    Then the menu is presented
    And the client receives status code of 200