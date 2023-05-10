@Test
Feature: Search data pemilihan tetap
  As user want to search data

  Scenario: user search data by name with valid data
    Given user already login
    And user already page pemilih tetap
    When user input field "Bisma" search filter name valid
    Then user succesfull filter data name appear name "Bisma"

  Scenario: user search data by name with invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field "hamba@34" search filter name invalid
    Then user appear text error Nothing found - sorry

  Scenario: user search data by nik valid data
    Given user already login
    And user already page pemilih tetap
    When user input field "010100111" search filter NIK valid
    Then user succesfull filter data Nik appear "010100111*******"

  Scenario: user search data by nik invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field "3879lo*****" search filter NIK invalid
    Then user appear text error Nothing found - sorry

  Scenario: user search data by Jenis Kelamin valid data
    Given user already login
    And user already page pemilih tetap
    When user input field "Perempuan" search  jenis kelamin valid
    Then user succesfull filter data Jenis kelamin appear "Perempuan"

  Scenario: user search data by Jenis Kelamin invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field "Perempuan969" search jenis kelamin invalid
    Then user appear text error Nothing found - sorry

  Scenario: user search  data by Alamat valid data
    Given user already login
    And user already page pemilih tetap
    When user input field search "Malang, RT. 1, RW. 3, Kel. Dusun Curup, Kec. Curup Utara, Rejang Lebong, Bengkulu" search  alamat valid
    Then user succesfull filter data alamat appear "Malang, RT. 1, RW. 3, Kel. Dusun Curup, Kec. Curup Utara, Rejang Lebong, Bengkulu"

  Scenario: user search  data by Alamat invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field search "Bandug58" search  alamat invalid
    Then user appear text error Nothing found - sorry

  Scenario: user search  data by TPS valid data
    Given user already login
    And user already page pemilih tetap
    When user input field "curup Tes" search  TPS valid
    Then user succesfull filter data TPS appear "curup Tes"

  Scenario: user search  data by TPS invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field "tps09090" search  TPS invalid
    Then user appear text error Nothing found - sorry

  Scenario: user search  data by status valid data
    Given user already login
    And user already page pemilih tetap
    When user input field search "POTENSI" search  alamat valid
    Then user succesfull filter data status appear "POTENSI"

  Scenario: user search  data by status invalid data
    Given user already login
    And user already page pemilih tetap
    When user input field search "POTENSI454" search  alamat valid
    Then user appear text error Nothing found - sorry






