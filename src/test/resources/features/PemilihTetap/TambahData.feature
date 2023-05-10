@Test
Feature: input pemilih tetap with tambah data
  As user want to input data

  Scenario: user input pemilih tetap with valid data
    Given user already login
    And user already page pemilih tetap
    When user click button tambah
    And user input valid data form pemilihan tetap
    Then user click apply
    And user succesfuly input data direct to page pemilihan tetap