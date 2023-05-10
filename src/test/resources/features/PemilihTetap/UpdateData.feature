@Test
Feature: update data pemilih tetap
  As user want to update data

  Scenario: user update pemilih tetap with valid data
    Given user already login
    And user already page pemilih tetap
    When user click button update data
    And user input update valid data form pemilihan tetap
    Then user click apply
    And user succesfuly input data direct to page pemilihan tetap