@Test
Feature: Filter data pemilihan tetap
  As user want to filter data

  Scenario: user filter with valid data
    Given user already login
    And user already page pemilih tetap
    When user click button icon filter
    And user select dropdown filder valid data
    Then user click apply filter data
    And User verify filter data appear name TPS filter data