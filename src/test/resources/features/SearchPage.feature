@searchBox
Feature: Automation to Search Box


  Background:
    Given i should be able to see the Main Page
    Then i should be able to click cookies info bar

  Scenario:Automation to Search Box
    Given i should be able to clear the default content
    Then i should be able to send "fra" to From inputbox
    And i should be able to see all suggested airports from the list
    When i should be able to select the Brazil airport from the list