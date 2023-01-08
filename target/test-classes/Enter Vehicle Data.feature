Feature: Access the website http://sampleapp.tricentis.com/101/app.php
  # I will access the website and fill in the "Enter Vehicle Data" tab
  Scenario: Select option in "Make"
    Given I was able to access the website
    Then the tab "Enter vehicle data" is displayed
    When I click on "Make" options
    And select a valid option
    Then a correct symbol is displayed in the field

  Scenario: Select option in "Model"
    When I click on "Model" options
    And select a valid option
    Then a correct symbol is displayed in the field

  Scenario: Write to "Cylinder Capacity [ccm]"
    When I click on the "Cylinder Capacity [ccm]" field
    And type value between 1 and 2000
    Then a correct symbol is displayed in the field

  Scenario: Write to "Engine Performance [kW]"
    When I click on the "Cylinder Capacity [ccm]" field
    And type value between 1 and 2000
    Then a correct symbol is displayed in the field

  Scenario: Select the "Date of Manufacture"
    When I click on the calendar symbol
    And select a date equal to or before the current day
    Then a correct symbol is displayed in the field

  Scenario: Select the "Number of Seats"
    When I click on "Number of Seats" options
    And select a valid option
    Then a correct symbol is displayed in the field

  Scenario: Select "Yes" or "No" in "Right Hand Drive"
    Given the options you must choose "Yes" or "No" in "Right Hand Drive"

  Scenario: Select the "Number of Seats"


  Scenario: Select the "Fuel Type"


  Scenario: Write to "Payload [kg]"
    When I click on the "Payload [kg]" field
    And type value between 1 and 1000
    Then a correct symbol is displayed in the field

  Scenario: Write to "Total Weight [kg]"
    When I click on the "Total Weight [kg]" field
    And type value between 100 and 50000
    Then a correct symbol is displayed in the field

  Scenario: Write to "List Price [$]"
    When I click on the "Payload [kg]" field
    And type value between 500 and 100000
    Then a correct symbol is displayed in the field

  Scenario: Write to "License Plate Number"
    When I click on the "Payload [kg]" field
    And type value between 0 and 9999999999
    Then a correct symbol is displayed in the field

  Scenario: Write to "Annual Mileage [mi]"
    When I click on the "Payload [kg]" field
    And type value between 100 and 100000
    Then a correct symbol is displayed in the field