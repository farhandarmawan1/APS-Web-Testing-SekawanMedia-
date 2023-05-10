@Test
Feature: import data pemilih tetap excel
  As user want to import data

  Scenario: user import data pemilih tetap with data valid excel
    Given user already login
    And user already page pemilih tetap
    When user click dropdown tambah data
    And user click import data
    And user choose file excel with valid data
    Then user click apply and click ok pop up warning
    And user succesfully upload data

  Scenario: user import data pemilih tetap with blank data excel
    Given user already login
    And user already page pemilih tetap
    When user click dropdown tambah data
    And user click import data
    And user choose file excel with blank data
    Then user click apply and click ok pop up warning
    And user appear warning error